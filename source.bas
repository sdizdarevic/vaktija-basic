#Region Project Attributes 
	#MainFormWidth: 315
	#MainFormHeight: 390
#End Region
 
 


Sub Process_Globals
	Private fx As JFX
	Private MainForm As Form
	Dim Listanova As List
	Dim vremena As String
	Dim Lista3 As List 'lista nosi gradove
	Dim vremrazlike1,vremrazlike2, vremrazlike3 As List
	Private ListView1 As ListView
	Private Label1 As Label
	Private ComboBox1 As ComboBox
	Private ListView2 As ListView
	 
	 
End Sub

Sub AppStart (Form1 As Form, Args() As String)
	MainForm = Form1
	'MainForm.RootPane.LoadLayout("Layout1") 'Load the layout file.
	MainForm.RootPane.LoadLayout("vaktl") 'Load the layout file.
	MainForm.Show
	'Log("Test")
	Myfcn
	' TODO napraviti i konfiguraciju, da se zapamti zadnji odabrani grad
	
End Sub

Sub Myfcn
 	'Log("12222")
	'Log(File.DirApp) 'za dio gdje je aplikacija (tu ubacit txt)
	 
	Dim dayofy As Int = DateTime.GetDayOfYear(DateTime.Now) 'daj mi trenutni dan u godini
 	Dim monofy As Int = DateTime.GetMonth(DateTime.Now) ' daj mi trenutni mjesec
  
	'Log("mjesec je = " & monofy )
	Log("dan je = " & dayofy )
	 
	Dim List1,List2 As List
	List1 = File.ReadList(File.DirApp, "times.txt")
	Dim tdifputanja As String
	tdifputanja="timeDifferences"
	If monofy < 10 Then
		tdifputanja = tdifputanja & "0" & monofy &".txt"
		Else
		tdifputanja = tdifputanja & monofy &".txt"
	End If
	
	'List2=File.ReadList(File.DirApp,"timeDifferences.txt")
	List2=File.ReadList(File.DirApp,tdifputanja)
 	ListView2.Items.AddAll(Array As String("Zora", "I. sunca", "Podne", "Ikindija", "Aksam","Jacija"))
	
	Dim Listagradovi() As String 
	'Dim vremrazlike1,vremrazlike2, vremrazlike3 As List
	'Dim Lista3 As List 'lista nosi gradove
	Lista3.Initialize
	vremrazlike1.Initialize
	vremrazlike2.Initialize
	vremrazlike3.Initialize
	
	'privremena=Regex.Split(";", List2.Get(2)) pojedinacni red-> pa treba gradovi(1)
	' meni treba privremena2(0-1-2-3)..
	For i=0 To List2.Size-1
		Listagradovi=Regex.Split(";", List2.Get(i)) 'iz liste2 daj mi gradove
		Lista3.Add(Listagradovi(1)) '-> grad je sa indeksom 1 (broj opcina vremena)
		'vremrazlike1.Add(Listagradovi(2)) 'isunca,zora
		'vremrazlike2.Add(Listagradovi(3)) 'podne
		'vremrazlike3.Add(Listagradovi(4)) 'ikindija,zsunca, jacija
		vremrazlike1.Add(Listagradovi(2))
		vremrazlike2.Add(Listagradovi(3))
		vremrazlike3.Add(Listagradovi(4))
		
	Next
	Log("pazi ovo: " & vremrazlike1.Get(1))	'prvi grad - banovici
	Log(Lista3.Get(2))
	
	'Dim cData1() As String  = Regex.Split(";", List2.Get(5)) -> BILECA
	'Log(cData1(1))
	'Dim cData1() As String  = Regex.Split(";", grad1)
	
	'Log("prvo " & grad1)
	For i = 0 To List1.Size - 1
		Log(List1.Get(i))
'		ListView1.Items.Add(List1.Get(i))
	Next
	'Dim vremena As String
	
  	Dim grad As String
	grad=List1.Get(32)
	Log("test")
	Log(List1.Get(32))
	Log("grad je "& grad )
	Dim cData() As String  = Regex.Split(" ", grad)
	Log(cData(5))
	  

	''Dim Listanova As List
	Listanova.Initialize
	'ComboBox1.Items.AddAll(Array As String("aa","bb","cc"))
	For i=1 To Lista3.Size-1
		ComboBox1.Items.AddAll(Array As String(Lista3.Get(i))) '-> posalji gradove na combobox
	Next
	
	'If dayofy>365 Then
	vremena=List1.Get(dayofy-1)
	'Else
	'vremena=List1.Get(365)
	'End If
	  
	'Dim List2 As List
	'List2.Initialize
	'List2.AddAll(Array As String("t1","t2","t3","t4"))
	'DateTime.Time(now) vrijeme
	  
 	Log(vremena.SubString2(2,7)) 
	Listanova.Add(vremena.SubString2(6,11))
	Listanova.Add(vremena.SubString2(12,17))
	Listanova.Add(vremena.SubString2(18,23))
	Listanova.Add(vremena.SubString2(24,29))
	Listanova.Add(vremena.SubString2(30,35))
	Listanova.Add(vremena.SubString2(36,41))
	'Listanova.Add(1111+5) -> radi
	'Dim zora(), isunca(), podne(), ikindija(), aksam(), jacija() As String
	'zora(0)= sat zora(1) = minuta
	'zora=Regex.Split(":",vremena.SubString2(6,11))
	'Log("zora" & zora(0) )
	
	 
	'Dim nekistring As String ="12"
	'Dim broj As Int
	'broj=nekistring+1
	'Log("string knverzija = " & broj) 'string knverzija = 13
	'Log(dayofy)
	
	'ListView1.Items.Add(List1.Get(18))
	For i=0 To Listanova.Size-1
		ListView1.Items.Add(Listanova.Get(i))
	Next
	
	'Log("sumvremen "&sumavremena("05:59","2"))	
	Log("sumvremen "&sumavremena("05:59","-2"))	
	
	
End Sub

''Sub buttonclicked
	''dodajvremena(sarajevo+uzetigrad)
	
 

Sub Button1_MouseClicked (EventData As MouseEvent)
	Log("odabran grad: " & (ComboBox1.SelectedIndex)) 'indeks odabranog grada 1-x.length
	'ListView1.Items.Set(0,"05:55") 'podesi novo vrijeme na ... (bez dodavanja), Add puni jedno ispod drugog
	'ListView1.Items.Set(1,"07:55")
	'Listanova.Add(vremena.SubString2(12,17))
	'Listanova.Add(vremena.SubString2(18,23))
	'Listanova.Add(vremena.SubString2(24,29))
	'Listanova.Add(vremena.SubString2(30,35))
	'Listanova.Add(vremena.SubString2(36,41))
	' Dim zor As Int=vremena.SubString2(6,11)+vremrazlike1.Get(5)
	 ', isunc,pod,ikind, aks, jac As Int
	 
	'ListView1.Items.Set(0,zor)
	
'	==========
	If (ComboBox1.SelectedIndex=-1) Then
		Log("Greska, nije odabrana lokacija!")
		ComboBox1.SelectedIndex=0
	End If
	
	ListView1.Items.Set(0,sumavremena(Listanova.Get(0),vremrazlike1.Get(ComboBox1.SelectedIndex+1)) ) 'vremrazlike1.Get(1) 1 index prvog grada
	ListView1.Items.Set(1,sumavremena(Listanova.Get(1),vremrazlike1.Get(ComboBox1.SelectedIndex+1)) )
	ListView1.Items.Set(2,sumavremena(Listanova.Get(2),vremrazlike2.Get(ComboBox1.SelectedIndex+1)) )
	ListView1.Items.Set(3,sumavremena(Listanova.Get(3),vremrazlike3.Get(ComboBox1.SelectedIndex+1)) )
	ListView1.Items.Set(4,sumavremena(Listanova.Get(4),vremrazlike3.Get(ComboBox1.SelectedIndex+1)) )
	ListView1.Items.Set(5,sumavremena(Listanova.Get(5),vremrazlike3.Get(ComboBox1.SelectedIndex+1)) )
	'=============
	Label1.Text=Lista3.Get(ComboBox1.SelectedIndex+1)
'	
'	(vremena.SubString2(6,11) ListView1.Items.Set(4,sumavremena(Listanova.Get(4),vremrazlike3.Get(1)) )
'	(vremena.SubString2(12,17)
'	(vremena.SubString2(18,23)
'	(vremena.SubString2(24,29)
'	(vremena.SubString2(30,35)
'	(vremena.SubString2(36,41)
	
End Sub


Sub sumavremena(prvo As String, ofset As String) As String 'prvo kao "05:55", ofset kao "2"
'	
'		static string sumavremena (string prvo, string ofset) {
'		string suma, minuta,satn;
'		string[] sat;
'		int satprvi,minutaprvi, minutaofset, minutauk;
'		
'		sat=prvo.Split(':');
'		minuta=sat[1]; //minuta prvog
'		satn=sat[0];   //sat prvog
'		satprvi=System.Int32.Parse(satn);
'		minutaprvi=System.Int32.Parse(minuta);
'		minutaofset=System.Int32.Parse(ofset);
'		
'		 
	Dim suma, minuta,satn As String
	Dim sat() As String' sat : minuta minuta i satn
	Dim satprvi, minutaprvi,minutaofset,minutauk As Int
	'minuta=vremena.SubString2(12,17)
	'satn=
	sat=Regex.Split(":",prvo)
	minuta=sat(1)
	satn=sat(0)
	satprvi=satn
	minutaprvi=minuta
	minutaofset=ofset
	minutauk=minutaprvi+minutaofset
	
	If (minutauk >= 60) Then
		minutauk = minutauk Mod 60
		satprvi=satprvi+1
	End If
 
  
'	If (satprvi<10) Then 'dodato i za sate
'		suma= "0"&satprvi &":"& minutauk
'		
'		If (minutauk<10) Then
'		suma= "0"&satprvi& ":0"& minutauk
'		End If
'	Else
'		suma= satprvi& ":"& minutauk
'			
'	End If
	' slucajevi i sat i min <10, samo sat <10, samo min <10 i nijedno nije <10
	If (satprvi<10 And minutauk <10) Then
		suma= "0"&satprvi& ":0"& minutauk
		Else If (satprvi<10) Then
			suma= "0"&satprvi &":"& minutauk
			Else If (minutauk < 10) Then
				suma= satprvi& ":"& "0" & minutauk
				Else
					suma= satprvi& ":"& minutauk
		
	End If
	
	Return suma
End Sub