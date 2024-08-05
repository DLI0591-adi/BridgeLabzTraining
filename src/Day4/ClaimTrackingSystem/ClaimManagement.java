package Day4.ClaimTrackingSystem;

import java.util.ArrayList;
import java.util.List;

public class ClaimManagement {
    List<Claim> list = new ArrayList<>();
    public void addClaims(Claim claim){
        list.add(claim);
    }
    public void updateClaimStatus(String claimnum,Claim claim){
        for(int i=0;i<list.size();i++){
            if(list.get(i).getClaim_number().equals(claimnum)){
                list.set(i,claim);
                break;
            }
        }
    }
    public void statusOfClaims(String claimnum){
        for(Claim claims : list){
            if(claims.getClaim_number().equals(claimnum)){
                System.out.println(claims.getStatus());
            }
        }
    }
    public static void main(String[] args) {
        Claim claim=new Claim("1","11","Saket",2500000,"Approved");
        Claim claim1=new Claim("2","12","Harsh",5000000,"Approved");
        Claim claim2=new Claim("3","13","Aryan",7500000,"Pending");
        Claim claim3=new Claim("4","14","Ujjwal",5000000,"Rejected");
        Claim claim4=new Claim("5","15","Vasu",5500000,"Pending");
        Claim claim5=new Claim("6","16","Archit",3500000,"Rejected");
        ClaimManagement claims = new ClaimManagement();
        claims.addClaims(claim);
        claims.addClaims(claim1);
        claims.addClaims(claim2);
        claims.addClaims(claim3);
        claims.addClaims(claim4);
        claims.addClaims(claim5);
        claims.statusOfClaims("6");
        Claim claim6=new Claim("6","16","Archit",3500000,"Pending");
        claims.updateClaimStatus("6",claim6);
        claims.statusOfClaims("6");
    }
}