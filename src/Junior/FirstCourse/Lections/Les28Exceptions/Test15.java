package Junior.FirstCourse.Lections.Les28Exceptions;

public class Test15 {
    void marafon(int tempWind, int tempBega) throws PodvernutNoguException {
        if (tempBega > 12) {
            throw  new PodvernutNoguException("Temp bega bil sliskom visokim : " + tempBega);
        }
        if (tempWind > 32){
            throw new SveloMishcuException();
        }
        System.out.println("Vi probezali marafon");
    }

    public static void main(String[] args) {
        Test15 t = new Test15();

        try {
            t.marafon(40,13);
        } catch (PodvernutNoguException e) {
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("V lybom slychai vi polychite gramaty");
        }
    }

}

class PodvernutNoguException extends Exception {
    PodvernutNoguException(String message) {
        super(message);
    }

    PodvernutNoguException() {

    }
}

class SveloMishcuException extends RuntimeException {
    SveloMishcuException(String message) {
        super(message);
    }

    SveloMishcuException() {

    }
}