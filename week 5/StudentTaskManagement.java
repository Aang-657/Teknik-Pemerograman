import java.util.*;
import java.util.concurrent.*;

// Record untuk merepresentasikan mahasiswa dan tugas secara immutable
record Student(String id, String name) {}
record Assignment(String title, String content, int score) {}

public class StudentTaskManagement {
    // Immutable List untuk daftar tugas yang tersedia
    private static final List<String> assignments = List.of("Proyek Pra Ets", "Membuat Cerpen", "Eksplorasi Java");
    // Set immutable untuk daftar mata kuliah
    private static final Set<String> courses = Set.of("Proyek 1", "Pancasila", "Teknik Pemerograman");
    // Map immutable untuk daftar dosen pengampu mata kuliah
    private static final Map<String, String> courseTeachers = Map.of(
            "Proyek 1 ", " Dr. Kholid",
            "Pancasila ", " Dr. Hilman",
            "Teknik Pemerograman ", " Dr. Zulkifli"
    );
    // Concurrent Set untuk menyimpan tugas yang sudah dikumpulkan
    private static final Set<String> submittedAssignments = ConcurrentHashMap.newKeySet();
    // Map untuk menyimpan nilai tugas mahasiswa
    private static final Map<String, Integer> grades = new ConcurrentHashMap<>();
    // Concurrent Map untuk menyimpan tugas yang sedang aktif
    private static final ConcurrentMap<String, Assignment> activeAssignments = new ConcurrentHashMap<>();
    // Queue untuk menyimpan antrian tugas yang akan diperiksa
    private static final Queue<Student> gradingQueue = new LinkedList<>();
    // Dequeue untuk menangani revisi tugas
    private static final Deque<Student> revisionQueue = new ArrayDeque<>();

    // Mengambil nilai mahasiswa berdasarkan ID menggunakan Optional
    public static Optional<Integer> getGrade(String studentId) {
        return Optional.ofNullable(grades.get(studentId));
    }

    // Mahasiswa mengumpulkan tugas
    public static boolean submitAssignment(Student student, String title, String content) {
        if (!assignments.contains(title) || submittedAssignments.contains(student.id())) {
            return false;
        }
        activeAssignments.put(student.id(), new Assignment(title, content, 0));
        submittedAssignments.add(student.id());
        return true;
    }

    // Menambahkan mahasiswa ke antrian pemeriksaan tugas atau revisi
    public static void addToGradingQueue(Student student, boolean needsRevision) {
        if (needsRevision) {
            revisionQueue.addFirst(student);
        } else {
            gradingQueue.add(student);
        }
    }

    // Memproses pemeriksaan tugas
    public static void processGrading() {
        while (!revisionQueue.isEmpty() || !gradingQueue.isEmpty()) {
            Student student = !revisionQueue.isEmpty() ? revisionQueue.pollFirst() : gradingQueue.poll();
            System.out.println("Grading assignment for: " + student.name());
            grades.put(student.id(), new Random().nextInt(100));
        }
    }

    public static void main(String[] args) {

        System.out.println("Daftar Mata Kuliah yang tersedia " + courses);
        System.out.println("Daftar Dosen Pengampu: " + courseTeachers);
        System.out.println("Daftar tugas yang tersedia: " + assignments);

        Student student1 = new Student("2415240XX", "Aulia");
        Student student2 = new Student("2415240XY", "Julian");
        
        submitAssignment(student1, "Proyek Pra Ets", "Isi tugas Aulia");
        submitAssignment(student2, "Proyek Pra Ets", "Isi tugas Julian");
        
        addToGradingQueue(student1, false);
        addToGradingQueue(student2, true);
        
        System.out.println("Daftar mahasiswa dalam antrian revisi: " + revisionQueue);
        
        processGrading();
        
        System.out.println("Nilai Aulia: " + getGrade("2415240XX").orElse(-1));
        System.out.println("Nilai Julian: " + getGrade("2415240XY").orElse(-1));
    }
}