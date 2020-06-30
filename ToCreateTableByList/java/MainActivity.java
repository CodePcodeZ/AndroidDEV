package codep.codez;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView TheListView = findViewById(R.id.ListView_OnMainActivity);


        final String[] Array1_ColumnKey = GiveMeUrData_ColumnKey();
        final String[] Array1_ColumnValue1 = GiveMeUrData_ColumnValue1();
        final String[] Array1_ColumnValue2 = GiveMeUrData_ColumnValue2();
        final String[] Array1_ColumnValue3 = GiveMeUrData_ColumnValue3();   //TODO


        final ArrayList<String[]> Container_Columns0ToN = new ArrayList<>();
        Container_Columns0ToN.add(Array1_ColumnKey);
        Container_Columns0ToN.add(Array1_ColumnValue1);
        Container_Columns0ToN.add(Array1_ColumnValue2);
        Container_Columns0ToN.add(Array1_ColumnValue3); //TODO


        //TODO , Column Layout TextView in .xml
        int[] ModuleListColumns_ViewID = {R.id.ModuleListColumn1, R.id.ModuleListColumn2, R.id.ModuleListColumn3, R.id.ModuleListColumn4};  //TODO


        String[] TitleOfColumns = new String[ModuleListColumns_ViewID.length];
        TitleOfColumns[0] = "TheKey";
        TitleOfColumns[1] = "TheValue1";
        TitleOfColumns[2] = "TheValue2";
        TitleOfColumns[3] = "TheValue3";    //TODO , loop ok :: TitleOfColumns can be Transform to FOR LOOP , like:
//        for (int i = 0; i < TitleOfColumns.length; i++) {
//            TitleOfColumns[i] = "Column" + i;
//        }


        int res_Layout_ColumnStyle = R.layout.simpleadapterlayout;


        myToCreateTableByList TheTable = new myToCreateTableByList(this, TheListView, Container_Columns0ToN, ModuleListColumns_ViewID, TitleOfColumns, res_Layout_ColumnStyle);


        //Just for Example of setOnItemClickListener
        TheTable.ListViewOnActivity.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Log.w("TAG", "Test On MainActivity:");
                for (int i = 0; i < Container_Columns0ToN.size(); i++) {
                    Log.w("TAG", "Information Here:" + Container_Columns0ToN.get(i)[position]);
                }

            }
        });


    }

    private String[] GiveMeUrData_ColumnKey() {

        return new String[]{
                "牡羊座", "金牛座", "雙子座", "巨蟹座", "獅子座", "處女座", "天秤座", "天蠍座", "射手座", "魔羯座", "水瓶座", "雙魚座",
                "",
                "a牡羊座", "a金牛座", "a雙子座", "a巨蟹座", "a獅子座", "a處女座", "a天秤座", "a天蠍座", "a射手座", "a魔羯座", "a水瓶座", "a雙魚座",
                "",
                "b牡羊座", "b金牛座", "b雙子座", "b巨蟹座", "b獅子座", "b處女座", "b天秤座", "b天蠍座", "b射手座", "b魔羯座", "b水瓶座", "b雙魚座"
        };

    }

    private String[] GiveMeUrData_ColumnValue1() {

        return new String[]{
                "3月21日～4月20日", "4月21日～5月20日", "5月21日～6月20日", "6月21日～7月20日", "7月21日～8月20日", "8月21日～9月20日", "9月21日～10月20日", "10月21日～11月20日", "11月21日～12月20日", "12月21日～1月20日", "1月21日～2月20日", "2月21日～3月20日",
                "",
                "3月21日～4月20日", "4月21日～5月20日", "5月21日～6月20日", "6月21日～7月20日", "7月21日～8月20日", "8月21日～9月20日", "9月21日～10月20日", "10月21日～11月20日", "11月21日～12月20日", "12月21日～1月20日", "1月21日～2月20日", "2月21日～3月20日",
                "",
                "3月21日～4月20日", "4月21日～5月20日", "5月21日～6月20日", "6月21日～7月20日", "7月21日～8月20日", "8月21日～9月20日", "9月21日～10月20日", "10月21日～11月20日", "11月21日～12月20日", "12月21日～1月20日", "1月21日～2月20日", "2月21日～3月20日"
        };

    }

    private String[] GiveMeUrData_ColumnValue2() {

        return new String[]{
                "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12",
                "",
                "A1", "A2", "A3", "A4", "A5", "A6", "A7", "A8", "A9", "A10", "A11", "A12",
                "",
                "B1", "B2", "B3", "B4", "B5", "B6", "B7", "B8", "B9", "B10", "B11", "B12"
        };

    }

    private String[] GiveMeUrData_ColumnValue3() {

        return new String[]{
                "1z", "2z", "3z", "4z", "5z", "6z", "7z", "8z", "9z", "10z", "11z", "12z",
                "",
                "A1z", "A2z", "A3z", "A4z", "A5z", "A6z", "A7z", "A8z", "A9z", "A10z", "A11z", "A12z",
                "",
                "B1z", "B2z", "B3z", "B4z", "B5z", "B6z", "B7z", "B8z", "B9z", "B10z", "B11z", "B12z"
        };

    }


}
