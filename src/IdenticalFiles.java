import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IdenticalFiles {
    private String firstFileString;
    private String secondFileString;
    private String firstFilePath;
    private String secondFilePath;
    private Scanner firstFileReader;
    private Scanner secondFileReader;
    private Scanner input;


    IdenticalFiles(){
        input = new Scanner(System.in);

    }
    public void getFilePaths(){

        try{
            System.out.println("First file path: ");
            firstFilePath = input.nextLine();
            System.out.println("Enter second file path");
            secondFilePath = input.nextLine();
            firstFileReader = new Scanner(new File(firstFilePath));
            secondFileReader = new Scanner(new File(secondFilePath));

        }
        catch (FileNotFoundException e){
            System.out.println("Files entered either don't exist or you entered a wrong path");
            input.close();
            System.exit(0);
        }


    }

    public void readFirstFile() {
        firstFileString = "";
        while(firstFileReader.hasNextLine()){
            firstFileString+=firstFileReader.nextLine();
        }
        firstFileString = firstFileString.trim();
        firstFileReader.close();

    }

    public void readSecondFile(){
        secondFileString = "";
        while(secondFileReader.hasNextLine()){
            secondFileString+=secondFileReader.nextLine();
        }
        secondFileString = secondFileString.trim();
        secondFileReader.close();
    }

    public String areFilesIdentical(){
        if(firstFileString.equalsIgnoreCase(secondFileString)){
            return "They are identical";
        }

        return "They are not identical";
    }




}
