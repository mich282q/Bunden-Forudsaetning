package mich282q.Aflevering26_10;

/*denne klasse skal indeholde nogle klasse-variabler,
constructors og klasse-metoder, som kan beskrive datamatikerstuderende
på dit hold.*/

public class Studerende {


    private String name = "noName ";
    private int age = 0;
    private String tlf = "noPhone ";
    private String hold = "noCourse ";

    //no arg constructor
    public Studerende() {}

    //constructor med info
    public  Studerende (String name){
        this.name = name;
    }

    public Studerende (String name, int age){
        this.name = name;
        this.age = age;

    }
    public Studerende (String name, int age, String hold){
        this.name = name;
        this.age = age;
        this.hold = hold;
    }

    //constructor med alle info: navn, alder, hold og telefon nummer.
    public Studerende (String name, int age, String hold, String tlf) {
        this.name = name;
        this.age = age;
        this.hold = hold;
        this.tlf = tlf;

    }
    // set metoder
    public void setName(){
        this.name = name;
    }
    public void setAge(){
        this.age = age;
    }
    public void setHold(){
        this.hold = hold;
    }
    public void setTlf(){
        this.tlf = tlf;
    }
    //Get metoder
    public String getName (){
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getHold () {
        return hold;
    }
    public String getTlf (){
        return tlf;
    }

}
