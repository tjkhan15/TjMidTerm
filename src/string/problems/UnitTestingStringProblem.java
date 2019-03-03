package string.problems;

public class UnitTestingStringProblem {
    public static void main(String[] args) {
        //Apply Unit Test into all the methods in this package.

        System.out.println();
        System.out.println("This is UnitTestingStringProblem for Anagram");
        Anagram ana = new Anagram();
        ana.checkAnagram("CAT","ACT");
        ana.checkAnagram("MARY","ARMY");

        System.out.println();
        System.out.println("This is UnitTestingStringProblem for DuplicateWord");
        DuplicateWord dupWord = new DuplicateWord();
        dupWord.duplicateWord("Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language");

    }
}
