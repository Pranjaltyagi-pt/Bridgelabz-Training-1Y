class SecurityService {

    public void processData(Object obj) {

        if (obj instanceof SensitiveData) {
            System.out.println("Encrypting sensitive data...");
        } else {
            System.out.println("Normal data, no encryption needed.");
        }
    }
}