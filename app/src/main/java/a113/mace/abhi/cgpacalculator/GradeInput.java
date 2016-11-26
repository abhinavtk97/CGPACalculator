package a113.mace.abhi.cgpacalculator;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;

public class GradeInput extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade_input);
        Intent intent =getIntent();
        Bundle bundle =intent.getExtras();
        String sp1=bundle.getString("sp1");
        String sp2=bundle.getString("sp2");
        String sp3=bundle.getString("sp3");
        TextView t1 = (TextView)findViewById(R.id.sub1);
        TextView t2 = (TextView)findViewById(R.id.sub2);
        TextView t3 = (TextView)findViewById(R.id.sub3);
        TextView t4 = (TextView)findViewById(R.id.sub4);
        TextView t5 = (TextView)findViewById(R.id.sub5);
        TextView t6 = (TextView)findViewById(R.id.sub6);
        TextView t7 = (TextView)findViewById(R.id.sub7);
        TextView t8 = (TextView)findViewById(R.id.sub8);
        TextView t9 = (TextView)findViewById(R.id.sub9);

        if(sp1.contentEquals("S1")){

                t1.setText("Calculus");
                t2.setText("Engineering Phy/Chem");
                if(sp3.contentEquals("Graphics")){
                    t3.setText("Engineering Graphics");}
                if (sp3.contentEquals("Mechanics")){
                    t3.setText("Engineering Mechanics");
                }
                t4.setText("Introduction to your subject");
                t5.setText("Basics of X Engineering");
                t6.setText("Sustainable Engineering");
                t7.setText("Phy/Chem Lab");
                t8.setText("Basic Engineering Workshop I");
                t9.setText("Basic Engineering Workshop II");
            }


        if (sp1.contentEquals("S2")){
            t1.setText("Differential Equations");
            t2.setText("Engineering Phy/Chem");
            if(sp3.contentEquals("Graphics")){
                t3.setText("Engineering Graphics");}
            if (sp3.contentEquals("Mechanics")){
                t3.setText("Engineering Mechanics");
            }
            t4.setText("Basics of X Engineering");
            t5.setText("Basics of Y Engineering");
            t6.setText("Design and Engineering");
            t7.setText("Phy/Chem Lab");
            t8.setText("Basic Engineering Workshop I");
            t9.setText("Basic Engineering Workshop II");

        }
        Spinner s9=(Spinner) findViewById(R.id.spinner8);

        if (sp1.contentEquals("S3")){
            if(sp2.contentEquals("Computer Science")){
                t1.setText("Linear Algebra & Complex Analysis");
                t2.setText("Discrete Computational Structures");
                t3.setText("Switching Theory and Logic Design");
                t4.setText("Data Structures ");
                t5.setText("Electronics Devices & Circuits");
                t6.setText("Life Skills/Business Economics");
                t7.setText("Data Structures Lab ");
                t8.setText("Electronics Circuits Lab");
                t9.setText("NA");
                s9.setEnabled(false);

            }
            if (sp2.contentEquals("Electrical and Electronics")){
                t1.setText("Linear Algebra & Complex Analysis");
                t2.setText("Circuits and Networks ");
                t3.setText("Analog Electronic Circuits");
                t4.setText("DC Machines and Transformers");
                t5.setText("Computer Programming ");
                t6.setText("Business Economics/Life Skills");
                t7.setText("Electronic Circuits Lab ");
                t8.setText("Programming Lab");
                t9.setText("NA");
                s9.setEnabled(false);
            }
            if (sp2.contentEquals("Electronics and Communication")){
                t1.setText("Linear Algebra & Complex Analysis");
                t2.setText("Network Theory");
                t3.setText("Solid State Devices");
                t4.setText("Electronic Circuits");
                t5.setText("Logic Circuit Design");
                t6.setText("Business Economics/Life Skills");
                t7.setText("Electronic Devices & Circuits Lab");
                t8.setText("Electronic Design Automation Lab");
                t9.setText("NA");
                s9.setEnabled(false);
            }
            if (sp2.contentEquals("Mechanical")){
                t1.setText("Linear Algebra & Complex Analysis");
                t2.setText("Mechanics of Solids");
                t3.setText("Mechanics of Fluids");
                t4.setText("Thermodynamics");
                t5.setText("Metallurgy and Materials Engineering");
                t6.setText("Business Economics/Life Skills");
                t7.setText("Computer Aided Machine Drawing Lab");
                t8.setText("Material Testing Lab");
                t9.setText("NA");
                s9.setEnabled(false);
            }
            if (sp2.contentEquals("Civil")){
                t1.setText("Linear Algebra & Complex Analysis");
                t2.setText("Mechanics of Solids");
                t3.setText("Fluid Mechanics I");
                t4.setText("Engineering Geology");
                t5.setText("Surveying");
                t6.setText("Business Economics/Life Skills");
                t7.setText("Civil Engineering Drafting Lab");
                t8.setText("Surveying Lab");
                t9.setText("NA");
                s9.setEnabled(false);
            }


        }
        List<String> list = new ArrayList<String>();
        list.add("OS");
        list.add("A+");
        list.add("A");
        list.add("B+");
        list.add("B");
        list.add("C");
        list.add("P");
        list.add("F");
        Spinner s1=(Spinner) findViewById(R.id.spinner);
        Spinner s2=(Spinner) findViewById(R.id.spinner1);
        Spinner s3=(Spinner) findViewById(R.id.spinner2);
        Spinner s4=(Spinner) findViewById(R.id.spinner3);
        Spinner s5=(Spinner) findViewById(R.id.spinner4);
        Spinner s6=(Spinner) findViewById(R.id.spinner5);
        Spinner s7=(Spinner) findViewById(R.id.spinner6);
        Spinner s8=(Spinner) findViewById(R.id.spinner7);

        ArrayAdapter<String> s1A = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,list);
        s1.setAdapter(s1A);
        s2.setAdapter(s1A);
        s3.setAdapter(s1A);
        s4.setAdapter(s1A);
        s5.setAdapter(s1A);
        s6.setAdapter(s1A);
        s7.setAdapter(s1A);
        s8.setAdapter(s1A);
        s9.setAdapter(s1A);




    }

    public double find(String abc){


            double pq;
            switch(abc)
            {
                case "OS":
                    pq=10;
                    break;
                case "A+":
                    pq=9;
                    break;
                case "A":
                    pq=8.5;
                    break;
                case "B+":
                    pq=8;
                    break;
                case "B":
                    pq=7;
                    break;
                case "C":
                    pq=6;
                    break;
                case "P":
                    pq=5;
                    break;
                case "F":
                    pq=0;
                default:
                    pq=0;
            }

            return pq;
    }
    public void calc(View view){
        TextView t1=(TextView)findViewById(R.id.textView6);


        Intent intent =getIntent();
        Bundle bundle =intent.getExtras();
        String sp1=bundle.getString("sp1");
        String sp2=bundle.getString("sp2");
        String sp3=bundle.getString("sp3");
        double gpa = 0;
        double gpa1;

        //credits according the order of the subjects
        int[] credits_s3 ={4,4,4,4,3,3,1,1};
        int[] credits_s12_graphics = {4,4,3,3,3,3,1,1,1};
        int[] credits_s12_mechanics = {4,4,4,3,3,3,1,1,1};
        //total credits in each sem
        int total_credits_s3 =  24;
        int total_credits_s12_graphics =  23;
        int total_credits_s12_mechanics =  24;

        int[] tempfile1 = new int[0];
        int tempfile2 = 0;
        if ((sp1.contentEquals("S1"))||(sp1.contentEquals("S2"))){
            if(sp3.contentEquals("Graphics")){
                tempfile1 = credits_s12_graphics;
                tempfile2 = total_credits_s12_graphics;
            }
            if (sp3.contentEquals("Mechanics")){
                tempfile1 = credits_s12_mechanics;
                tempfile2 = total_credits_s12_mechanics;
            }
        }
        if (sp1.contentEquals("S3")){
            tempfile1 = credits_s3;
            tempfile2 = total_credits_s3;
        }

        Spinner s1 = (Spinner)findViewById (R.id.spinner);
        Spinner s2 = (Spinner)findViewById (R.id.spinner1);
        Spinner s3 = (Spinner)findViewById (R.id.spinner2);
        Spinner s4 = (Spinner)findViewById (R.id.spinner3);
        Spinner s5 = (Spinner)findViewById (R.id.spinner4);
        Spinner s6 = (Spinner)findViewById (R.id.spinner5);
        Spinner s7 = (Spinner)findViewById (R.id.spinner6);
        Spinner s8 = (Spinner)findViewById (R.id.spinner7);
        Spinner s9 = (Spinner)findViewById (R.id.spinner8);
        String gr1=String.valueOf(s1.getSelectedItem());
        String gr2=String.valueOf(s2.getSelectedItem());
        String gr3=String.valueOf(s3.getSelectedItem());
        String gr4=String.valueOf(s4.getSelectedItem());
        String gr5=String.valueOf(s5.getSelectedItem());
        String gr6=String.valueOf(s6.getSelectedItem());
        String gr7=String.valueOf(s7.getSelectedItem());
        String gr8=String.valueOf(s8.getSelectedItem());
        String gr9=String.valueOf(s9.getSelectedItem());

        double g1=find(gr1);
        double g2=find(gr2);
        double g3=find(gr3);
        double g4=find(gr4);
        double g5=find(gr5);
        double g6=find(gr6);
        double g7=find(gr7);
        double g8=find(gr8);
        double g9=find(gr9);

        if (sp1.contentEquals("S1")||sp1.contentEquals("S2")){
            gpa=(g1*tempfile1[0]+g2*tempfile1[1]+g3*tempfile1[2]+g4*tempfile1[3]+g5*tempfile1[4]+g6*tempfile1[5]+g7*tempfile1[6]+g8*tempfile1[7]+g9*tempfile1[8])/tempfile2;
            Formatter fmt = new Formatter();
            fmt.format("%.2f",gpa);
        }

        else {
            gpa=(g1*tempfile1[0]+g2*tempfile1[1]+g3*tempfile1[2]+g4*tempfile1[3]+g5*tempfile1[4]+g6*tempfile1[5]+g7*tempfile1[6]+g8*tempfile1[7])/tempfile2;
            Formatter fmt = new Formatter();
            fmt.format("%.2f",gpa);
        }

        String st=String.valueOf(gpa);

        AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
        dlgAlert.setMessage(st);
        dlgAlert.setTitle("Your CGPA");
        dlgAlert.setPositiveButton("OK", null);
        dlgAlert.setCancelable(true);
        dlgAlert.create().show();
        dlgAlert.setPositiveButton("Ok",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        //dismiss the dialog
                    }
                });

    }
}
