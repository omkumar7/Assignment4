public class RemoveLeadingZeros {
    public static void removeLeadingZeros(String str)
    {

        String remove = "0";

        str = str.replaceAll(remove, "");

        System.out.println(str);
    }

    public static void main(String args[])
    {
        String str = "00012345";

        removeLeadingZeros(str);
    }

}
