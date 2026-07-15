package OOPS.basicPractice;

public class Student {
    private String name;
    private String regNO;
    private short rollNO;
    private float marks;
    private String address;
    private long phoneNo;

    public String getName() {
        return name;
    }

    public String getRegNO() {
        return regNO;
    }

    public short getRollNO() {
        return rollNO;
    }

    public float getMarks() {
        return marks;
    }

    public String getAddress() {
        return address;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNO(short rollNO) {
        this.rollNO = rollNO;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }
     public Student (String name,String regNo,Short rollNo){
        this.name=name;
        this.regNO=regNo;
        this.rollNO=rollNo;
     }
     public Student (String name,String regNo,short rollNO,float marks,long phoneNo,String address){
        this.name=name;
        this.regNO=regNo;
        this.rollNO=rollNO;
        this.address=address;
        this.phoneNo=phoneNo;
        this.marks=marks;
    }



}
