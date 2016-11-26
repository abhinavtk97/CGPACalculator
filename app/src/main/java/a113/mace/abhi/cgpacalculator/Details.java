package a113.mace.abhi.cgpacalculator;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Details extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
Spinner spinnerSem,spinnerBranch,spinnerSub;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        spinnerSem = (Spinner)findViewById (R.id.sem);
        spinnerBranch = (Spinner) findViewById (R.id.branch);
        spinnerSub = (Spinner) findViewById (R.id.sub);
        ArrayAdapter<CharSequence> semAdapter = ArrayAdapter.createFromResource(this, R.array.sem, android.R.layout.simple_spinner_item);
        semAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerSem.setAdapter(semAdapter);
        spinnerSem.setOnItemSelectedListener(this);


    }
    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1,int arg2, long arg3){
        String sp1=String.valueOf(spinnerSem.getSelectedItem());
        String sp2=String.valueOf(spinnerBranch.getSelectedItem());
        String sp3=String.valueOf(spinnerSub.getSelectedItem());
        Toast.makeText(this,sp2,Toast.LENGTH_SHORT).show();
        Toast.makeText(this,sp1,Toast.LENGTH_SHORT).show();
        if (sp1.contentEquals("S1")||sp1.contentEquals("S2")){
            spinnerSub.setEnabled(true);
            List<String> list = new ArrayList<String>();
            list.add("Computer Science");
            list.add("Electrical and Electronics");
            list.add("Electronics and Communication");
            list.add("Mechanical");
            list.add("Civil");
            ArrayAdapter<String> branchAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,list);
            branchAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            branchAdapter.notifyDataSetChanged();
            spinnerBranch.setAdapter(branchAdapter);
            List<String> list1=new ArrayList<String>();
            list1.add("Mechanics");
            list1.add("Graphics");
            ArrayAdapter<String> subAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,list1);
            subAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            subAdapter.notifyDataSetChanged();
            spinnerSub.setAdapter(subAdapter);
        }
        if(sp1.contentEquals("S3")){
            spinnerSub.setEnabled(false);
        }




    }
    @Override
    public void onNothingSelected(AdapterView<?> arg0){
    }

    public void inputact(View view){
        String sp1=String.valueOf(spinnerSem.getSelectedItem());
        String sp2=String.valueOf(spinnerBranch.getSelectedItem());
        String sp3=String.valueOf(spinnerSub.getSelectedItem());
        if (spinnerSub.isActivated()){
            sp3="NULL";
        }
        Intent intent = new Intent(this,GradeInput.class);
        Bundle extras = new Bundle();
        extras.putString("sp1",sp1);
        extras.putString("sp2",sp2);
        extras.putString("sp3",sp3);
        intent.putExtras(extras);
        startActivity(intent);
    }


}
