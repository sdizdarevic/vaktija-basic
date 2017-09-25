package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.debug.*;

public class main extends javafx.application.Application{
public static main mostCurrent = new main();

public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.main", null);
		ba.loadHtSubs(main.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.main", ba);
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}

 
    public static void main(String[] args) {
    	launch(args);
    }
    public void start (javafx.stage.Stage stage) {
        try {
            if (!false)
                System.setProperty("prism.lcdtext", "false");
            anywheresoftware.b4j.objects.FxBA.application = this;
		    anywheresoftware.b4a.keywords.Common.setDensity(javafx.stage.Screen.getPrimary().getDpi());
            anywheresoftware.b4a.keywords.Common.LogDebug("Program started.");
            initializeProcessGlobals();
            anywheresoftware.b4j.objects.Form frm = new anywheresoftware.b4j.objects.Form();
            frm.initWithStage(ba, stage, 315, 390);
            ba.raiseEvent(null, "appstart", frm, (String[])getParameters().getRaw().toArray(new String[0]));
        } catch (Throwable t) {
            BA.printException(t, true);
            System.exit(1);
        }
    }
public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static anywheresoftware.b4j.objects.Form _mainform = null;
public static anywheresoftware.b4a.objects.collections.List _listanova = null;
public static String _vremena = "";
public static anywheresoftware.b4a.objects.collections.List _lista3 = null;
public static anywheresoftware.b4a.objects.collections.List _vremrazlike1 = null;
public static anywheresoftware.b4a.objects.collections.List _vremrazlike2 = null;
public static anywheresoftware.b4a.objects.collections.List _vremrazlike3 = null;
public static anywheresoftware.b4j.objects.ListViewWrapper _listview1 = null;
public static anywheresoftware.b4j.objects.LabelWrapper _label1 = null;
public static anywheresoftware.b4j.objects.ComboBoxWrapper _combobox1 = null;
public static anywheresoftware.b4j.objects.ListViewWrapper _listview2 = null;
public static String  _appstart(anywheresoftware.b4j.objects.Form _form1,String[] _args) throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
 //BA.debugLineNum = 25;BA.debugLine="MainForm = Form1";
_mainform = _form1;
 //BA.debugLineNum = 27;BA.debugLine="MainForm.RootPane.LoadLayout(\"vaktl\") 'Load the l";
_mainform.getRootPane().LoadLayout(ba,"vaktl");
 //BA.debugLineNum = 28;BA.debugLine="MainForm.Show";
_mainform.Show();
 //BA.debugLineNum = 30;BA.debugLine="Myfcn";
_myfcn();
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return "";
}
public static String  _button1_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 157;BA.debugLine="Sub Button1_MouseClicked (EventData As MouseEvent)";
 //BA.debugLineNum = 158;BA.debugLine="Log(\"odabran grad: \" & (ComboBox1.SelectedIndex))";
anywheresoftware.b4a.keywords.Common.Log("odabran grad: "+BA.NumberToString((_combobox1.getSelectedIndex())));
 //BA.debugLineNum = 172;BA.debugLine="If (ComboBox1.SelectedIndex=-1) Then";
if ((_combobox1.getSelectedIndex()==-1)) { 
 //BA.debugLineNum = 173;BA.debugLine="Log(\"Greska, nije odabrana lokacija!\")";
anywheresoftware.b4a.keywords.Common.Log("Greska, nije odabrana lokacija!");
 //BA.debugLineNum = 174;BA.debugLine="ComboBox1.SelectedIndex=0";
_combobox1.setSelectedIndex((int) (0));
 };
 //BA.debugLineNum = 177;BA.debugLine="ListView1.Items.Set(0,sumavremena(Listanova.Get(0";
_listview1.getItems().Set((int) (0),(Object)(_sumavremena(BA.ObjectToString(_listanova.Get((int) (0))),BA.ObjectToString(_vremrazlike1.Get((int) (_combobox1.getSelectedIndex()+1))))));
 //BA.debugLineNum = 178;BA.debugLine="ListView1.Items.Set(1,sumavremena(Listanova.Get(1";
_listview1.getItems().Set((int) (1),(Object)(_sumavremena(BA.ObjectToString(_listanova.Get((int) (1))),BA.ObjectToString(_vremrazlike1.Get((int) (_combobox1.getSelectedIndex()+1))))));
 //BA.debugLineNum = 179;BA.debugLine="ListView1.Items.Set(2,sumavremena(Listanova.Get(2";
_listview1.getItems().Set((int) (2),(Object)(_sumavremena(BA.ObjectToString(_listanova.Get((int) (2))),BA.ObjectToString(_vremrazlike2.Get((int) (_combobox1.getSelectedIndex()+1))))));
 //BA.debugLineNum = 180;BA.debugLine="ListView1.Items.Set(3,sumavremena(Listanova.Get(3";
_listview1.getItems().Set((int) (3),(Object)(_sumavremena(BA.ObjectToString(_listanova.Get((int) (3))),BA.ObjectToString(_vremrazlike3.Get((int) (_combobox1.getSelectedIndex()+1))))));
 //BA.debugLineNum = 181;BA.debugLine="ListView1.Items.Set(4,sumavremena(Listanova.Get(4";
_listview1.getItems().Set((int) (4),(Object)(_sumavremena(BA.ObjectToString(_listanova.Get((int) (4))),BA.ObjectToString(_vremrazlike3.Get((int) (_combobox1.getSelectedIndex()+1))))));
 //BA.debugLineNum = 182;BA.debugLine="ListView1.Items.Set(5,sumavremena(Listanova.Get(5";
_listview1.getItems().Set((int) (5),(Object)(_sumavremena(BA.ObjectToString(_listanova.Get((int) (5))),BA.ObjectToString(_vremrazlike3.Get((int) (_combobox1.getSelectedIndex()+1))))));
 //BA.debugLineNum = 184;BA.debugLine="Label1.Text=Lista3.Get(ComboBox1.SelectedIndex+1)";
_label1.setText(BA.ObjectToString(_lista3.Get((int) (_combobox1.getSelectedIndex()+1))));
 //BA.debugLineNum = 193;BA.debugLine="End Sub";
return "";
}
public static String  _myfcn() throws Exception{
int _dayofy = 0;
int _monofy = 0;
anywheresoftware.b4a.objects.collections.List _list1 = null;
anywheresoftware.b4a.objects.collections.List _list2 = null;
String _tdifputanja = "";
String[] _listagradovi = null;
int _i = 0;
String _grad = "";
String[] _cdata = null;
 //BA.debugLineNum = 35;BA.debugLine="Sub Myfcn";
 //BA.debugLineNum = 39;BA.debugLine="Dim dayofy As Int = DateTime.GetDayOfYear(DateTim";
_dayofy = anywheresoftware.b4a.keywords.Common.DateTime.GetDayOfYear(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
 //BA.debugLineNum = 40;BA.debugLine="Dim monofy As Int = DateTime.GetMonth(DateTime.N";
_monofy = anywheresoftware.b4a.keywords.Common.DateTime.GetMonth(anywheresoftware.b4a.keywords.Common.DateTime.getNow());
 //BA.debugLineNum = 43;BA.debugLine="Log(\"dan je = \" & dayofy )";
anywheresoftware.b4a.keywords.Common.Log("dan je = "+BA.NumberToString(_dayofy));
 //BA.debugLineNum = 45;BA.debugLine="Dim List1,List2 As List";
_list1 = new anywheresoftware.b4a.objects.collections.List();
_list2 = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 46;BA.debugLine="List1 = File.ReadList(File.DirApp, \"times.txt\")";
_list1 = anywheresoftware.b4a.keywords.Common.File.ReadList(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"times.txt");
 //BA.debugLineNum = 47;BA.debugLine="Dim tdifputanja As String";
_tdifputanja = "";
 //BA.debugLineNum = 48;BA.debugLine="tdifputanja=\"timeDifferences\"";
_tdifputanja = "timeDifferences";
 //BA.debugLineNum = 49;BA.debugLine="If monofy < 10 Then";
if (_monofy<10) { 
 //BA.debugLineNum = 50;BA.debugLine="tdifputanja = tdifputanja & \"0\" & monofy &\".txt\"";
_tdifputanja = _tdifputanja+"0"+BA.NumberToString(_monofy)+".txt";
 }else {
 //BA.debugLineNum = 52;BA.debugLine="tdifputanja = tdifputanja & monofy &\".txt\"";
_tdifputanja = _tdifputanja+BA.NumberToString(_monofy)+".txt";
 };
 //BA.debugLineNum = 56;BA.debugLine="List2=File.ReadList(File.DirApp,tdifputanja)";
_list2 = anywheresoftware.b4a.keywords.Common.File.ReadList(anywheresoftware.b4a.keywords.Common.File.getDirApp(),_tdifputanja);
 //BA.debugLineNum = 57;BA.debugLine="ListView2.Items.AddAll(Array As String(\"Zora\", \"";
_listview2.getItems().AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"Zora","I. sunca","Podne","Ikindija","Aksam","Jacija"}));
 //BA.debugLineNum = 59;BA.debugLine="Dim Listagradovi() As String";
_listagradovi = new String[(int) (0)];
java.util.Arrays.fill(_listagradovi,"");
 //BA.debugLineNum = 62;BA.debugLine="Lista3.Initialize";
_lista3.Initialize();
 //BA.debugLineNum = 63;BA.debugLine="vremrazlike1.Initialize";
_vremrazlike1.Initialize();
 //BA.debugLineNum = 64;BA.debugLine="vremrazlike2.Initialize";
_vremrazlike2.Initialize();
 //BA.debugLineNum = 65;BA.debugLine="vremrazlike3.Initialize";
_vremrazlike3.Initialize();
 //BA.debugLineNum = 69;BA.debugLine="For i=0 To List2.Size-1";
{
final int step20 = 1;
final int limit20 = (int) (_list2.getSize()-1);
for (_i = (int) (0) ; (step20 > 0 && _i <= limit20) || (step20 < 0 && _i >= limit20); _i = ((int)(0 + _i + step20)) ) {
 //BA.debugLineNum = 70;BA.debugLine="Listagradovi=Regex.Split(\";\", List2.Get(i)) 'iz";
_listagradovi = anywheresoftware.b4a.keywords.Common.Regex.Split(";",BA.ObjectToString(_list2.Get(_i)));
 //BA.debugLineNum = 71;BA.debugLine="Lista3.Add(Listagradovi(1)) '-> grad je sa indek";
_lista3.Add((Object)(_listagradovi[(int) (1)]));
 //BA.debugLineNum = 75;BA.debugLine="vremrazlike1.Add(Listagradovi(2))";
_vremrazlike1.Add((Object)(_listagradovi[(int) (2)]));
 //BA.debugLineNum = 76;BA.debugLine="vremrazlike2.Add(Listagradovi(3))";
_vremrazlike2.Add((Object)(_listagradovi[(int) (3)]));
 //BA.debugLineNum = 77;BA.debugLine="vremrazlike3.Add(Listagradovi(4))";
_vremrazlike3.Add((Object)(_listagradovi[(int) (4)]));
 }
};
 //BA.debugLineNum = 80;BA.debugLine="Log(\"pazi ovo: \" & vremrazlike1.Get(1))	'prvi gra";
anywheresoftware.b4a.keywords.Common.Log("pazi ovo: "+BA.ObjectToString(_vremrazlike1.Get((int) (1))));
 //BA.debugLineNum = 81;BA.debugLine="Log(Lista3.Get(2))";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(_lista3.Get((int) (2))));
 //BA.debugLineNum = 88;BA.debugLine="For i = 0 To List1.Size - 1";
{
final int step29 = 1;
final int limit29 = (int) (_list1.getSize()-1);
for (_i = (int) (0) ; (step29 > 0 && _i <= limit29) || (step29 < 0 && _i >= limit29); _i = ((int)(0 + _i + step29)) ) {
 //BA.debugLineNum = 89;BA.debugLine="Log(List1.Get(i))";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(_list1.Get(_i)));
 }
};
 //BA.debugLineNum = 94;BA.debugLine="Dim grad As String";
_grad = "";
 //BA.debugLineNum = 95;BA.debugLine="grad=List1.Get(32)";
_grad = BA.ObjectToString(_list1.Get((int) (32)));
 //BA.debugLineNum = 96;BA.debugLine="Log(\"test\")";
anywheresoftware.b4a.keywords.Common.Log("test");
 //BA.debugLineNum = 97;BA.debugLine="Log(List1.Get(32))";
anywheresoftware.b4a.keywords.Common.Log(BA.ObjectToString(_list1.Get((int) (32))));
 //BA.debugLineNum = 98;BA.debugLine="Log(\"grad je \"& grad )";
anywheresoftware.b4a.keywords.Common.Log("grad je "+_grad);
 //BA.debugLineNum = 99;BA.debugLine="Dim cData() As String  = Regex.Split(\" \", grad)";
_cdata = anywheresoftware.b4a.keywords.Common.Regex.Split(" ",_grad);
 //BA.debugLineNum = 100;BA.debugLine="Log(cData(5))";
anywheresoftware.b4a.keywords.Common.Log(_cdata[(int) (5)]);
 //BA.debugLineNum = 104;BA.debugLine="Listanova.Initialize";
_listanova.Initialize();
 //BA.debugLineNum = 106;BA.debugLine="For i=1 To Lista3.Size-1";
{
final int step40 = 1;
final int limit40 = (int) (_lista3.getSize()-1);
for (_i = (int) (1) ; (step40 > 0 && _i <= limit40) || (step40 < 0 && _i >= limit40); _i = ((int)(0 + _i + step40)) ) {
 //BA.debugLineNum = 107;BA.debugLine="ComboBox1.Items.AddAll(Array As String(Lista3.Ge";
_combobox1.getItems().AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{BA.ObjectToString(_lista3.Get(_i))}));
 }
};
 //BA.debugLineNum = 111;BA.debugLine="vremena=List1.Get(dayofy-1)";
_vremena = BA.ObjectToString(_list1.Get((int) (_dayofy-1)));
 //BA.debugLineNum = 121;BA.debugLine="Log(vremena.SubString2(2,7))";
anywheresoftware.b4a.keywords.Common.Log(_vremena.substring((int) (2),(int) (7)));
 //BA.debugLineNum = 122;BA.debugLine="Listanova.Add(vremena.SubString2(6,11))";
_listanova.Add((Object)(_vremena.substring((int) (6),(int) (11))));
 //BA.debugLineNum = 123;BA.debugLine="Listanova.Add(vremena.SubString2(12,17))";
_listanova.Add((Object)(_vremena.substring((int) (12),(int) (17))));
 //BA.debugLineNum = 124;BA.debugLine="Listanova.Add(vremena.SubString2(18,23))";
_listanova.Add((Object)(_vremena.substring((int) (18),(int) (23))));
 //BA.debugLineNum = 125;BA.debugLine="Listanova.Add(vremena.SubString2(24,29))";
_listanova.Add((Object)(_vremena.substring((int) (24),(int) (29))));
 //BA.debugLineNum = 126;BA.debugLine="Listanova.Add(vremena.SubString2(30,35))";
_listanova.Add((Object)(_vremena.substring((int) (30),(int) (35))));
 //BA.debugLineNum = 127;BA.debugLine="Listanova.Add(vremena.SubString2(36,41))";
_listanova.Add((Object)(_vremena.substring((int) (36),(int) (41))));
 //BA.debugLineNum = 142;BA.debugLine="For i=0 To Listanova.Size-1";
{
final int step51 = 1;
final int limit51 = (int) (_listanova.getSize()-1);
for (_i = (int) (0) ; (step51 > 0 && _i <= limit51) || (step51 < 0 && _i >= limit51); _i = ((int)(0 + _i + step51)) ) {
 //BA.debugLineNum = 143;BA.debugLine="ListView1.Items.Add(Listanova.Get(i))";
_listview1.getItems().Add(_listanova.Get(_i));
 }
};
 //BA.debugLineNum = 147;BA.debugLine="Log(\"sumvremen \"&sumavremena(\"05:59\",\"-2\"))";
anywheresoftware.b4a.keywords.Common.Log("sumvremen "+_sumavremena("05:59","-2"));
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return "";
}

private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 9;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 11;BA.debugLine="Private MainForm As Form";
_mainform = new anywheresoftware.b4j.objects.Form();
 //BA.debugLineNum = 12;BA.debugLine="Dim Listanova As List";
_listanova = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 13;BA.debugLine="Dim vremena As String";
_vremena = "";
 //BA.debugLineNum = 14;BA.debugLine="Dim Lista3 As List 'lista nosi gradove";
_lista3 = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 15;BA.debugLine="Dim vremrazlike1,vremrazlike2, vremrazlike3 As Li";
_vremrazlike1 = new anywheresoftware.b4a.objects.collections.List();
_vremrazlike2 = new anywheresoftware.b4a.objects.collections.List();
_vremrazlike3 = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 16;BA.debugLine="Private ListView1 As ListView";
_listview1 = new anywheresoftware.b4j.objects.ListViewWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Private Label1 As Label";
_label1 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Private ComboBox1 As ComboBox";
_combobox1 = new anywheresoftware.b4j.objects.ComboBoxWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Private ListView2 As ListView";
_listview2 = new anywheresoftware.b4j.objects.ListViewWrapper();
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return "";
}
public static String  _sumavremena(String _prvo,String _ofset) throws Exception{
String _suma = "";
String _minuta = "";
String _satn = "";
String[] _sat = null;
int _satprvi = 0;
int _minutaprvi = 0;
int _minutaofset = 0;
int _minutauk = 0;
 //BA.debugLineNum = 196;BA.debugLine="Sub sumavremena(prvo As String, ofset As String) A";
 //BA.debugLineNum = 211;BA.debugLine="Dim suma, minuta,satn As String";
_suma = "";
_minuta = "";
_satn = "";
 //BA.debugLineNum = 212;BA.debugLine="Dim sat() As String' sat : minuta minuta i satn";
_sat = new String[(int) (0)];
java.util.Arrays.fill(_sat,"");
 //BA.debugLineNum = 213;BA.debugLine="Dim satprvi, minutaprvi,minutaofset,minutauk As I";
_satprvi = 0;
_minutaprvi = 0;
_minutaofset = 0;
_minutauk = 0;
 //BA.debugLineNum = 216;BA.debugLine="sat=Regex.Split(\":\",prvo)";
_sat = anywheresoftware.b4a.keywords.Common.Regex.Split(":",_prvo);
 //BA.debugLineNum = 217;BA.debugLine="minuta=sat(1)";
_minuta = _sat[(int) (1)];
 //BA.debugLineNum = 218;BA.debugLine="satn=sat(0)";
_satn = _sat[(int) (0)];
 //BA.debugLineNum = 219;BA.debugLine="satprvi=satn";
_satprvi = (int)(Double.parseDouble(_satn));
 //BA.debugLineNum = 220;BA.debugLine="minutaprvi=minuta";
_minutaprvi = (int)(Double.parseDouble(_minuta));
 //BA.debugLineNum = 221;BA.debugLine="minutaofset=ofset";
_minutaofset = (int)(Double.parseDouble(_ofset));
 //BA.debugLineNum = 222;BA.debugLine="minutauk=minutaprvi+minutaofset";
_minutauk = (int) (_minutaprvi+_minutaofset);
 //BA.debugLineNum = 224;BA.debugLine="If (minutauk >= 60) Then";
if ((_minutauk>=60)) { 
 //BA.debugLineNum = 225;BA.debugLine="minutauk = minutauk Mod 60";
_minutauk = (int) (_minutauk%60);
 //BA.debugLineNum = 226;BA.debugLine="satprvi=satprvi+1";
_satprvi = (int) (_satprvi+1);
 };
 //BA.debugLineNum = 241;BA.debugLine="If (satprvi<10 And minutauk <10) Then";
if ((_satprvi<10 && _minutauk<10)) { 
 //BA.debugLineNum = 242;BA.debugLine="suma= \"0\"&satprvi& \":0\"& minutauk";
_suma = "0"+BA.NumberToString(_satprvi)+":0"+BA.NumberToString(_minutauk);
 }else if((_satprvi<10)) { 
 //BA.debugLineNum = 244;BA.debugLine="suma= \"0\"&satprvi &\":\"& minutauk";
_suma = "0"+BA.NumberToString(_satprvi)+":"+BA.NumberToString(_minutauk);
 }else if((_minutauk<10)) { 
 //BA.debugLineNum = 246;BA.debugLine="suma= satprvi& \":\"& \"0\" & minutauk";
_suma = BA.NumberToString(_satprvi)+":"+"0"+BA.NumberToString(_minutauk);
 }else {
 //BA.debugLineNum = 248;BA.debugLine="suma= satprvi& \":\"& minutauk";
_suma = BA.NumberToString(_satprvi)+":"+BA.NumberToString(_minutauk);
 };
 //BA.debugLineNum = 252;BA.debugLine="Return suma";
if (true) return _suma;
 //BA.debugLineNum = 253;BA.debugLine="End Sub";
return "";
}
}
