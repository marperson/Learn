<map version="docear 1.1" dcr_id="1451437215773_liy1hcvu4z9f4a2rroghcjxe" project="151E539E1AD64IICYI99Z0RKV79ZQQ5TBKR" project_last_home="file:/C:/Users/marpe/Docear/projects/Learn">
<!--To view this file, download Docear - The Academic Literature Suite from http://www.docear.org -->
<node TEXT="Java -  Data structures Measuring and Optimizing Performance" FOLDED="false" ID="ID_1723255651" CREATED="1283093380553" MODIFIED="1451437244832"><hook NAME="MapStyle">
    <properties show_note_icons="true"/>

<map_styles>
<stylenode LOCALIZED_TEXT="styles.root_node">
<stylenode LOCALIZED_TEXT="styles.predefined" POSITION="right">
<stylenode LOCALIZED_TEXT="default" MAX_WIDTH="600" COLOR="#000000" STYLE="as_parent">
<font NAME="SansSerif" SIZE="10" BOLD="false" ITALIC="false"/>
</stylenode>
<stylenode LOCALIZED_TEXT="defaultstyle.details"/>
<stylenode LOCALIZED_TEXT="defaultstyle.note"/>
<stylenode LOCALIZED_TEXT="defaultstyle.floating">
<edge STYLE="hide_edge"/>
<cloud COLOR="#f0f0f0" SHAPE="ROUND_RECT"/>
</stylenode>
</stylenode>
<stylenode LOCALIZED_TEXT="styles.user-defined" POSITION="right">
<stylenode LOCALIZED_TEXT="styles.topic" COLOR="#18898b" STYLE="fork">
<font NAME="Liberation Sans" SIZE="10" BOLD="true"/>
</stylenode>
<stylenode LOCALIZED_TEXT="styles.subtopic" COLOR="#cc3300" STYLE="fork">
<font NAME="Liberation Sans" SIZE="10" BOLD="true"/>
</stylenode>
<stylenode LOCALIZED_TEXT="styles.subsubtopic" COLOR="#669900">
<font NAME="Liberation Sans" SIZE="10" BOLD="true"/>
</stylenode>
<stylenode LOCALIZED_TEXT="styles.important">
<icon BUILTIN="yes"/>
</stylenode>
</stylenode>
<stylenode LOCALIZED_TEXT="styles.AutomaticLayout" POSITION="right">
<stylenode LOCALIZED_TEXT="AutomaticLayout.level.root" COLOR="#000000">
<font SIZE="18"/>
</stylenode>
<stylenode LOCALIZED_TEXT="AutomaticLayout.level,1" COLOR="#0033ff">
<font SIZE="16"/>
</stylenode>
<stylenode LOCALIZED_TEXT="AutomaticLayout.level,2" COLOR="#00b439">
<font SIZE="14"/>
</stylenode>
<stylenode LOCALIZED_TEXT="AutomaticLayout.level,3" COLOR="#990000">
<font SIZE="12"/>
</stylenode>
<stylenode LOCALIZED_TEXT="AutomaticLayout.level,4" COLOR="#111111">
<font SIZE="10"/>
</stylenode>
</stylenode>
</stylenode>
</map_styles>
</hook>
<hook NAME="AutomaticEdgeColor" COUNTER="4"/>
<hook NAME="accessories/plugins/AutomaticLayout.properties" VALUE="ALL"/>
<node TEXT="Intro" POSITION="right" ID="ID_1322001207" CREATED="1451437234785" MODIFIED="1451437237309">
<edge COLOR="#ff0000"/>
</node>
<node TEXT="String" POSITION="right" ID="ID_537375519" CREATED="1451438074347" MODIFIED="1451438076167">
<edge COLOR="#00ff00"/>
<node TEXT="Intern String" ID="ID_67196815" CREATED="1451453130655" MODIFIED="1451453135712">
<node TEXT="String s1 = &quot;This is a string&quot;;&#xa;String s2 = new String(&quot;This is a string&quot;);&#xa;String s3 = s2;&#xa;String s4 = &quot;This is a string&quot;;" ID="ID_1353737381" CREATED="1451455701812" MODIFIED="1451455704299" MOVED="1451455726673">
<node TEXT="2 new object only" ID="ID_1247405054" CREATED="1451455708094" MODIFIED="1451455723888"/>
<node TEXT="Line 1 and 4 are Intern String, which has not new keyword, it creates new object ONLY if it detects different text" ID="ID_258687298" CREATED="1451455740577" MODIFIED="1451455844560"/>
<node TEXT="Line 3 does&apos;t have new, so it just create a Reference and point to same object like S2" ID="ID_1337874825" CREATED="1451455789871" MODIFIED="1451455873632"/>
</node>
</node>
<node TEXT="String is immutable" ID="ID_1514130040" CREATED="1451453135881" MODIFIED="1451453143959">
<node TEXT="String s = &quot;Hello&quot;;&#xa;s.concat(&quot; World!&quot;);&#xa;System.out.println(s);" ID="ID_502366578" CREATED="1451455672070" MODIFIED="1451455676320">
<node TEXT="Result is &quot;Hello&quot;" ID="ID_90887341" CREATED="1451455681392" MODIFIED="1451455689199"/>
</node>
</node>
<node TEXT="equal and ==" ID="ID_1096687421" CREATED="1451455653946" MODIFIED="1451455670336">
<node TEXT="Primitive Type: ==" ID="ID_453849247" CREATED="1451455919227" MODIFIED="1451456078485"/>
<node TEXT="Object: equal" ID="ID_967116580" CREATED="1451455926803" MODIFIED="1451455937150"/>
</node>
</node>
<node TEXT="RegEx" POSITION="right" ID="ID_949644826" CREATED="1451453162846" MODIFIED="1451455635543">
<edge COLOR="#ff00ff"/>
<node TEXT="&quot;this is a test.23,54,390.&quot; =&gt; [&quot;this is a test&quot;, &quot;23&quot;, &quot;54&quot;, &quot;390&quot;]" ID="ID_1024670069" CREATED="1451456079192" MODIFIED="1451456088642">
<node TEXT="d.getTokens(&quot;[a-z0-9 ]+&quot;);" ID="ID_449921141" CREATED="1451456089408" MODIFIED="1451456100636"/>
<node TEXT="d.getTokens(&quot;[^.,]+&quot;);" ID="ID_536884662" CREATED="1451456100794" MODIFIED="1451456106609"/>
<node TEXT="d.getTokens(&quot;[a-z ]+|[0-9]+&quot;);" ID="ID_1712210086" CREATED="1451456106858" MODIFIED="1451456117738">
<hook NAME="FirstGroupNode"/>
</node>
<node TEXT="[a-z0-9 ]+: Continuous String" ID="ID_1260842108" CREATED="1451456117732" MODIFIED="1451456840432">
<hook NAME="SummaryNode"/>
</node>
</node>
</node>
<node TEXT="Text Editor" POSITION="left" ID="ID_1733422619" CREATED="1451437459790" MODIFIED="1451437465942">
<edge COLOR="#0000ff"/>
<node TEXT="Java -  Data structures Measuring and Optimizing Performance_2150996486813177803.png" ID="ID_889105075" CREATED="1451438538026" MODIFIED="1451438538026">
<hook URI="project://151E539E1AD64IICYI99Z0RKV79ZQQ5TBKR/../../../../../GitHub/Learn/Coursera%20-%20Data%20structures%20Measuring%20and%20Optimizing%20Performance/image/Java%20-%20%20Data%20structures%20Measuring%20and%20Optimizing%20Performance_2150996486813177803.png" SIZE="0.7614213" NAME="ExternalObject"/>
</node>
<node TEXT="Eclipse" ID="ID_1714635270" CREATED="1451456893251" MODIFIED="1451456896644">
<node TEXT="Import Exsiting Project to current workspace" ID="ID_642683998" CREATED="1451456841464" MODIFIED="1451456882673" MOVED="1451456900980"/>
<node TEXT="Add JUnit to your project" ID="ID_193613002" CREATED="1451456884201" MODIFIED="1451456886356" MOVED="1451456899323">
<node TEXT=" go to Project-&gt;Properties. Select &quot;Java Build Path&quot;. Select the &quot;Libraries&quot; tab and &quot;Add Library&quot;. Select JUnit, then JUnit 4" ID="ID_549431219" CREATED="1451456925060" MODIFIED="1451456927643" MOVED="1451456950417">
<node TEXT="Java -  Data structures Measuring and Optimizing Performance_75414496663448570.png" ID="ID_13377215" CREATED="1451457027836" MODIFIED="1451457027836">
<hook URI="project://151E539E1AD64IICYI99Z0RKV79ZQQ5TBKR/../../../../../GitHub/Learn/Coursera%20-%20Data%20structures%20Measuring%20and%20Optimizing%20Performance/image/Java%20-%20%20Data%20structures%20Measuring%20and%20Optimizing%20Performance_75414496663448570.png" SIZE="0.7682458" NAME="ExternalObject"/>
</node>
</node>
</node>
<node TEXT="Set up the workspace JRE." ID="ID_761042293" CREATED="1451457079664" MODIFIED="1451457082103" MOVED="1451457083712">
<node TEXT=" Right click on the MOOCTextEditor project folder in the Package Explorer and select Build Path-&gt;Configure Build Path. Go on the Libraries tab and click on &quot;Add Library&quot;. Select the &quot;JRE System Library&quot; and click Next. Select &quot;Workspace default JRE&quot; and click Finish. Then click OK" ID="ID_1353913720" CREATED="1451457096804" MODIFIED="1451457098619"/>
</node>
</node>
</node>
</node>
</map>
