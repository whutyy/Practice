public class susbsysTryUno {

    private ClimberSys() {
        mLog = new LogWrapper(FileType.SUBSYSTEM,"Intake", LoggerConstants.INTAKE_PERMISSION);
    }
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}