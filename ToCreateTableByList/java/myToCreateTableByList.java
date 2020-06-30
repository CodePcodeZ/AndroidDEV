package codep.codez;;

import android.content.Context;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class myToCreateTableByList {

    ListView ListViewOnActivity;
    Context context;

    ArrayList<String[]> Container_Columns0ToN;

    int[] ModuleListColumns_ViewID;
    String[] TitleOfColumns;


    myToCreateTableByList(Context context, ListView ListViewOnActivity, ArrayList<String[]> Container_Columns0ToN, int[] ModuleListColumns_ViewID, String[] TitleOfColumns) {

        this.context = context;
        this.ListViewOnActivity = ListViewOnActivity;

        this.Container_Columns0ToN = Container_Columns0ToN;


        this.ModuleListColumns_ViewID = ModuleListColumns_ViewID;
        this.TitleOfColumns = TitleOfColumns;


        DoTable();

    }

    private void DoTable() {

        List<Map<String, Object>> items = new ArrayList<Map<String, Object>>();

        for (int i = 0; i < Container_Columns0ToN.get(0).length; i++) {


            Map<String, Object> temp = new HashMap<String, Object>();


            /*
//            Remember , what's the for(j) mean
//            temp.put(TitleOfColumns[0], Array1_ColumnKey[i]);
//            temp.put(TitleOfColumns[1], Array1_ColumnValue1[i]);
//            temp.put(TitleOfColumns[2], Array1_ColumnValue2[i]);

             */
            for (int j = 0; j < Container_Columns0ToN.size(); j++) {
                temp.put(TitleOfColumns[j], Container_Columns0ToN.get(j)[i]);
            }


            items.add(temp);

        }


        SimpleAdapter simpleAdapter = new SimpleAdapter(context, items, R.layout.simpleadapterlayout, TitleOfColumns, ModuleListColumns_ViewID);

        ListViewOnActivity.setAdapter(simpleAdapter);

    }

}
