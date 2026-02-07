public class constructoroverloading {
    int sid;
    String sname;
    String saddress;
    String sdepartment;
    String sBloodgroup;

    int pId;
    String pname;
    int psalary;
    String pdepartment;

    public constructoroverloading(  int sid,String sname,String saddress,String sdepartment,String sBloodgroup){
        this.sname=sname;
        this.saddress=saddress;
        this.sdepartment=sdepartment;
        this.sBloodgroup=sBloodgroup;
    }


    public constructoroverloading( int pId,String pname,int psalary,String pdepartment) {
        this.pId = pId;
        this.pname = pname;
        this.psalary = psalary;
        this.pdepartment = pdepartment;
    }
    void printsData() {
        System.out.println("--------STUDENT "+ sname +" DETAILS--------");
        System.out.println("sid:" + sid);
        System.out.println("sName:" + sname);
        System.out.println("saddress:" + saddress);
        System.out.println("sdepartment:" + sdepartment);
        System.out.println("sBloodgroup:" +sBloodgroup);
    }
    void printpData() {
        System.out.println("--------PROFESSOR "+ pname +" DETAILS--------");
        System.out.println("pid:" + pId);
        System.out.println("pName:" + pname);
        System.out.println("psalary:" + psalary);
        System.out.println("pdepartment:" + pdepartment);
    }
    public static void main(String[] args) {
        constructoroverloading Anvith=new constructoroverloading(101,"Anvith","puttur","AIML","o+");
        constructoroverloading maneesh=new constructoroverloading(102,"maneesh","banglore","cs","o+");
        constructoroverloading govindraj=new constructoroverloading(201,"govindraj",50000,"cs");
        constructoroverloading anvesh=new constructoroverloading(202,"anvesh",60000,"AIML");

        Anvith.printsData();
        maneesh.printsData();
        govindraj.printpData();
        anvesh.printpData();

        }
    }


