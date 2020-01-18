package ProstyEnum;

public class ProstyEnum {
    public static void main(String[] args) {
        ProstyEnum1 dni = getDniTygodnia();
        System.out.println(getDniTygodnia());
        System.out.println(ProstyEnum1.poniedialek);
    }
    private static ProstyEnum1 getDniTygodnia(){
        return ProstyEnum1.czwartek;
    }
}
