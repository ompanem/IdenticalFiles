public class Main {

    public static void main(String[] args) {
        IdenticalFiles files = new IdenticalFiles();
        files.getFilePaths();
        files.readFirstFile();
        files.readSecondFile();
        System.out.println(files.areFilesIdentical());
    }


}
