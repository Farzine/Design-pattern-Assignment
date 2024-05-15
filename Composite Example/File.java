public class File implements FileSystem {
    private String name;
    private String space;

    public File(String name, String space){
        this.name = name;
        this.space = space;
    }

    @Override
    public void displayDetails() {
        System.out.println("File: " + name + ", Memory: " + space);
    }
}
