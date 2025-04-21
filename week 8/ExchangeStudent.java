public class ExchangeStudent<T> extends Student<T>{
    private String homeUniversity; // Universitas asal

    public ExchangeStudent(String name, T score, String homeUniversity) {
        super(name, score);
        this.homeUniversity = homeUniversity;
    }

    public String getHomeUniversity() {
        return homeUniversity;
    }

    public void setHomeUniversity(String homeUniversity) {
        this.homeUniversity = homeUniversity;
    }

    @Override
    public String toString() {
        return super.toString() + " - Exchange from: " + homeUniversity;
    }
}

