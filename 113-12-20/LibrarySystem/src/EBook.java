public class EBook {
    private String downloadurl;

    public EBook(String title, String author, String downloadurl) {
        super(title, author);
        this.downloadurl = downloadurl;
    }

    public String getdownloadurl() {
        return downloadurl;
    }

    @Override
    public String toString() {
        return super.toString() + ", 下載網址: " + downloadurl;
    }
}
