<map version="docear 1.1" project="150C975AE0D1XFBR538UQS4YW64T3I4YD23F" project_last_home="file:/C:/Users/frank.he/Desktop/Git/" dcr_id="1446488944511_cfk1im8remleox77h220cljsu">
<!--To view this file, download Docear - The Academic Literature Suite from http://www.docear.org -->
<node TEXT="GIT" FOLDED="false" ID="ID_1723255651" CREATED="1283093380553" MODIFIED="1446491290882"><hook NAME="MapStyle" zoom="1.001">
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
<hook NAME="AutomaticEdgeColor" COUNTER="6"/>
<hook NAME="accessories/plugins/AutomaticLayout.properties" VALUE="ALL"/>
<hook NAME="AlwaysUnfoldedNode"/>
<node TEXT="Introduction" POSITION="right" ID="ID_1178524352" CREATED="1446488994716" MODIFIED="1446491290888">
<edge COLOR="#7c007c"/>
<hook NAME="AlwaysUnfoldedNode"/>
</node>
<node TEXT="How to use the exercise files" POSITION="right" ID="ID_1859938207" CREATED="1446488994716" MODIFIED="1446491290897">
<edge COLOR="#007c7c"/>
<hook NAME="AlwaysUnfoldedNode"/>
</node>
<node TEXT="1. What is Git?" POSITION="right" ID="ID_1578269031" CREATED="1446488994725" MODIFIED="1446491290904" MOVED="1446489015389">
<edge COLOR="#7c7c00"/>
<hook NAME="AlwaysUnfoldedNode"/>
<node TEXT="Understanding version control" ID="ID_1041906524" CREATED="1446488994729" MODIFIED="1446491290908" MOVED="1446489029147">
<hook NAME="AlwaysUnfoldedNode"/>
<node TEXT="VCS: Version Control System" ID="ID_6665777" CREATED="1446489628190" MODIFIED="1446491290911">
<hook NAME="AlwaysUnfoldedNode"/>
</node>
<node TEXT="SCM: Source Code Management" ID="ID_408118984" CREATED="1446489699821" MODIFIED="1446491290913">
<hook NAME="AlwaysUnfoldedNode"/>
</node>
<node TEXT="Especially Text Changes" ID="ID_1420636215" CREATED="1446489644620" MODIFIED="1446491290916">
<hook NAME="AlwaysUnfoldedNode"/>
</node>
</node>
<node TEXT="The history of Git" ID="ID_1154306331" CREATED="1446488994729" MODIFIED="1446491290919" MOVED="1446489030269">
<hook NAME="AlwaysUnfoldedNode"/>
<node TEXT="SCCS: Source Code Control System" ID="ID_1865517740" CREATED="1446491816778" MODIFIED="1446491905960"/>
<node TEXT="RCS: Revision Control System" ID="ID_1624794422" CREATED="1446491906358" MODIFIED="1446491976207"/>
<node TEXT="CVS: Concurrent Versions System" ID="ID_1415616524" CREATED="1446491976379" MODIFIED="1446492016899"/>
<node TEXT="SVN: Aoache Subversion" ID="ID_657817347" CREATED="1446492017310" MODIFIED="1446492102643"/>
<node TEXT="BitKeeper SCM" ID="ID_548444029" CREATED="1446492111046" MODIFIED="1446492309610"/>
<node TEXT="GitHub launched in 2008 to host Git repositories" ID="ID_452373272" CREATED="1446492312501" MODIFIED="1446492362918"/>
</node>
<node TEXT="About distributed version control" ID="ID_1427185965" CREATED="1446492366313" MODIFIED="1446492370070">
<node TEXT="Different users maintain their own repositories, instead of working from a cental repository" ID="ID_1741975539" CREATED="1446492546078" MODIFIED="1446492577915"/>
<node TEXT="Changes are stored as &quot;change sets&quot; or &quot;patches&quot;" ID="ID_1982365778" CREATED="1446492578337" MODIFIED="1446492601179">
<node TEXT="tracks changes, not versions" ID="ID_623950990" CREATED="1446492601191" MODIFIED="1446492611558"/>
<node TEXT="changes sets chan be exchanged between repositories: merge, apply patch" ID="ID_1321037474" CREATED="1446492675720" MODIFIED="1446492707319"/>
</node>
<node TEXT="No single master repository, just many working copies" ID="ID_830815612" CREATED="1446492712154" MODIFIED="1446492887960"/>
<node TEXT="Encourages forking of projects" ID="ID_1480935450" CREATED="1446492888207" MODIFIED="1446493025100"/>
</node>
<node TEXT="Who should use Git?" ID="ID_869974758" CREATED="1446488994729" MODIFIED="1446491290924" MOVED="1446489032339">
<hook NAME="AlwaysUnfoldedNode"/>
<node TEXT="Command-line tool" ID="ID_736531352" CREATED="1446493027402" MODIFIED="1446493067733"/>
<node TEXT="not as useful for tracking non-text files" ID="ID_1151660242" CREATED="1446493068260" MODIFIED="1446493089199"/>
<node TEXT="not as useful for files interpreted by applications, PDFs, excel" ID="ID_1580612809" CREATED="1446493090342" MODIFIED="1446493135766"/>
</node>
</node>
<node TEXT="2. Installing Git" POSITION="right" ID="ID_1953542175" CREATED="1446488994729" MODIFIED="1446491290927">
<edge COLOR="#0000ff"/>
<hook NAME="AlwaysUnfoldedNode"/>
<node TEXT="Installing Git on a Mac" ID="ID_1568528137" CREATED="1446488994740" MODIFIED="1446491290931" MOVED="1446489046192">
<hook NAME="AlwaysUnfoldedNode"/>
</node>
<node TEXT="Installing Git on Windows" ID="ID_1416016622" CREATED="1446488994740" MODIFIED="1446491290933" MOVED="1446489047323">
<hook NAME="AlwaysUnfoldedNode"/>
<node TEXT="git --version" ID="ID_649981202" CREATED="1446493422439" MODIFIED="1446493427305"/>
<node TEXT="which git" ID="ID_1309898500" CREATED="1446493427767" MODIFIED="1446493430945"/>
</node>
<node TEXT="Installing Git on Linux" ID="ID_781538621" CREATED="1446488994740" MODIFIED="1446491290935" MOVED="1446489048590">
<hook NAME="AlwaysUnfoldedNode"/>
</node>
<node TEXT="Configuring Git" ID="ID_1033471001" CREATED="1446488994740" MODIFIED="1446491290937" MOVED="1446489049774">
<hook NAME="AlwaysUnfoldedNode"/>
<node TEXT="3 levels" ID="ID_580978043" CREATED="1446493581050" MODIFIED="1446493586755">
<node TEXT="System" ID="ID_659678629" CREATED="1446493508781" MODIFIED="1446493514954" MOVED="1446493589505">
<node TEXT="Linux: etc/gitconfig" ID="ID_1985118486" CREATED="1446493530327" MODIFIED="1446493550618"/>
<node TEXT="Windows: Program Files\Gits\etc\gitconfig" ID="ID_271830860" CREATED="1446493551177" MODIFIED="1446493574543"/>
</node>
<node TEXT="User" ID="ID_1408206662" CREATED="1446493575449" MODIFIED="1446493578909" MOVED="1446493590976">
<node TEXT="Linux home directory: ~/.gitconfig" ID="ID_917606167" CREATED="1446493593652" MODIFIED="1446493672330"/>
<node TEXT="Windows home directory: $HOME\.gitconfig" ID="ID_1026999897" CREATED="1446493625789" MODIFIED="1446493678835"/>
</node>
<node TEXT="Project:" ID="ID_221822587" CREATED="1446493679521" MODIFIED="1446493694166">
<node TEXT="my_project/.git/config" ID="ID_386406200" CREATED="1446493697172" MODIFIED="1446493734685"/>
</node>
</node>
<node TEXT="Modify configs" ID="ID_538429357" CREATED="1446493735526" MODIFIED="1446493741206">
<node TEXT="System: git config --system" ID="ID_601710943" CREATED="1446493741215" MODIFIED="1446495230393">
<hook NAME="FirstGroupNode"/>
</node>
<node TEXT="User: git config --global" ID="ID_591807680" CREATED="1446493751679" MODIFIED="1446493761872"/>
<node TEXT="Project: git config --local" ID="ID_1769898670" CREATED="1446493762841" MODIFIED="1446495241226"/>
<node TEXT="git config --list" ID="ID_1570269386" CREATED="1446495230385" MODIFIED="1446495237207">
<hook NAME="SummaryNode"/>
<node TEXT="git config user.name" ID="ID_180537955" CREATED="1446495283928" MODIFIED="1446495295790" MOVED="1446495297332"/>
</node>
</node>
<node TEXT="&apos;cd ~&apos; then &apos;ls -al&apos;, cat .gitconfig" ID="ID_1330837046" CREATED="1446495407378" MODIFIED="1446495491933">
<node TEXT="git config --global -e" ID="ID_1266046551" CREATED="1446495497688" MODIFIED="1446496436825"/>
</node>
<node TEXT="Add text editor" ID="ID_631201598" CREATED="1446495598808" MODIFIED="1446495606240">
<node TEXT="git config --global core.editor &quot;notepad.exe&quot;" ID="ID_1716761980" CREATED="1446495606253" MODIFIED="1446495671042">
<node TEXT="mate -wl1, vim -wl1, emacs -wl1 etc" ID="ID_1540815305" CREATED="1446495687926" MODIFIED="1446495733206"/>
</node>
</node>
<node TEXT="Add colors" ID="ID_929246612" CREATED="1446495734010" MODIFIED="1446495740282">
<node TEXT="gir config --global color.ui true" ID="ID_734498755" CREATED="1446495740294" MODIFIED="1446496429670"/>
</node>
</node>
<node TEXT="Exploring Git auto-completion" ID="ID_1109198981" CREATED="1446488994740" MODIFIED="1446491290938" MOVED="1446489050946">
<hook NAME="AlwaysUnfoldedNode"/>
</node>
<node TEXT="Using Git help" ID="ID_782973082" CREATED="1446488994740" MODIFIED="1446491290940" MOVED="1446489052231">
<hook NAME="AlwaysUnfoldedNode"/>
<node TEXT="git space help" ID="ID_1825351048" CREATED="1446499093032" MODIFIED="1446499100112">
<node TEXT="f: forward" ID="ID_539985028" CREATED="1446499100147" MODIFIED="1446499106642"/>
<node TEXT="b:backward" ID="ID_1696558360" CREATED="1446499107129" MODIFIED="1446499134037"/>
<node TEXT="q: quit" ID="ID_80098799" CREATED="1446499134434" MODIFIED="1446499168704"/>
<node TEXT="i.e. git help log" ID="ID_439218810" CREATED="1446499170166" MODIFIED="1446503239837"/>
</node>
</node>
</node>
<node TEXT="3. Getting Started" POSITION="right" ID="ID_1122306051" CREATED="1446488994740" MODIFIED="1446491290942">
<edge COLOR="#ff00ff"/>
<hook NAME="AlwaysUnfoldedNode"/>
<node TEXT="Initializing a repository" ID="ID_556723557" CREATED="1446488994749" MODIFIED="1446491290945" MOVED="1446489064350">
<hook NAME="AlwaysUnfoldedNode"/>
<node ID="ID_29147112" CREATED="1446499228897" MODIFIED="1446562163828"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">git init</font>
    </p>
  </body>
</html>
</richcontent>
<node TEXT="inside the root directory of tracking" ID="ID_1343321243" CREATED="1446499333793" MODIFIED="1446499686590"/>
</node>
</node>
<node TEXT="Understanding where Git files are stored" ID="ID_1035232190" CREATED="1446488994749" MODIFIED="1446491290946" MOVED="1446489065490">
<hook NAME="AlwaysUnfoldedNode"/>
<node TEXT="Remove .git folder will stop Git watches this folder" ID="ID_1725116953" CREATED="1446565413083" MODIFIED="1446565511535"/>
</node>
<node TEXT="Performing your first commit" ID="ID_844971351" CREATED="1446488994749" MODIFIED="1446491290948" MOVED="1446489066485">
<hook NAME="AlwaysUnfoldedNode"/>
<node TEXT="A Commit is a package, a snappshot of your project" ID="ID_1646406966" CREATED="1446562206911" MODIFIED="1446562219686"/>
<node TEXT="Git generates a checksum for each change set" ID="ID_677978042" CREATED="1446562220789" MODIFIED="1446562229189"/>
<node TEXT="No checksum is identical" ID="ID_722789137" CREATED="1446562231347" MODIFIED="1446562239226">
<node TEXT="HSA-1 : 40 character Hexadecimal string (0-9, a-f)" ID="ID_1543064040" CREATED="1446562239238" MODIFIED="1446566012796"/>
</node>
<node TEXT="Git init" ID="ID_1561968952" CREATED="1446562765888" MODIFIED="1446562776137">
<node TEXT="Git add ." ID="ID_1486945276" CREATED="1446562783717" MODIFIED="1446562789210">
<node TEXT="git commit -m &quot;initial commit&quot;" ID="ID_1105859349" CREATED="1446562796060" MODIFIED="1446562811499"/>
</node>
</node>
</node>
<node TEXT="Writing commit messages" ID="ID_727569745" CREATED="1446488994749" MODIFIED="1446491290950" MOVED="1446489067945">
<hook NAME="AlwaysUnfoldedNode"/>
<node TEXT="Descriptive and Specific" ID="ID_1186075228" CREATED="1446562927939" MODIFIED="1446563106714"/>
</node>
<node TEXT="Viewing the commit log" ID="ID_1766734980" CREATED="1446488994749" MODIFIED="1446491290952" MOVED="1446489069236">
<hook NAME="AlwaysUnfoldedNode"/>
<node TEXT="git log" ID="ID_1735884729" CREATED="1446565075194" MODIFIED="1446565143203">
<node TEXT="git help log" ID="ID_1565764853" CREATED="1446565145071" MODIFIED="1446565162314"/>
<node TEXT="git log -n 1" ID="ID_983683407" CREATED="1446565163833" MODIFIED="1446565170796"/>
<node TEXT="git log -n 2" ID="ID_1495217887" CREATED="1446565171705" MODIFIED="1446565198879"/>
<node TEXT="git log --since=2015-10-10" ID="ID_301248580" CREATED="1446565200426" MODIFIED="1446565213655"/>
<node TEXT="git log --until=2015-10-30" ID="ID_661639733" CREATED="1446565214620" MODIFIED="1446565231683"/>
<node TEXT="git log -- author=&quot;frank&quot;" ID="ID_704725016" CREATED="1446565239494" MODIFIED="1446565258793"/>
<node TEXT="git log --grep=&quot;Init&quot;" ID="ID_1035351864" CREATED="1446565259255" MODIFIED="1446565302105"/>
</node>
</node>
</node>
<node TEXT="4. Git Concepts and Architecture" POSITION="right" ID="ID_1701417485" CREATED="1446488994749" MODIFIED="1446491290954">
<edge COLOR="#ffff00"/>
<hook NAME="AlwaysUnfoldedNode"/>
<node TEXT="Exploring the three-trees architecture" ID="ID_1574592430" CREATED="1446488994756" MODIFIED="1446491290956" MOVED="1446489073542">
<hook NAME="AlwaysUnfoldedNode"/>
<node TEXT="Tranditional Two-Tree architecture" ID="ID_937893089" CREATED="1446499688507" MODIFIED="1446499857753" MOVED="1446565319246">
<node TEXT="Repository" ID="ID_622971196" CREATED="1446499719590" MODIFIED="1446499736492" MOVED="1446499734052">
<hook NAME="FirstGroupNode"/>
</node>
<node TEXT="Working Directory" ID="ID_807584220" CREATED="1446499700579" MODIFIED="1446499719136"/>
<node TEXT="Check-out, commit" ID="ID_1947391651" CREATED="1446499736483" MODIFIED="1446499930018">
<hook NAME="SummaryNode"/>
</node>
</node>
<node TEXT="Three-Tree Architecture" ID="ID_1239240202" CREATED="1446499858264" MODIFIED="1446499879804" MOVED="1446565321127">
<node TEXT="Repository" ID="ID_738039692" CREATED="1446499881658" MODIFIED="1446499906359">
<hook NAME="FirstGroupNode"/>
</node>
<node TEXT="Staging Index" ID="ID_723727437" CREATED="1446499887202" MODIFIED="1446499891347"/>
<node TEXT="Working Directory" ID="ID_1553766414" CREATED="1446499891961" MODIFIED="1446499904192"/>
<node ID="ID_755712672" CREATED="1446499906351" MODIFIED="1446562201479"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      Check-out, <font color="#0000ff">add,</font>&#160;commit
    </p>
  </body>
</html>
</richcontent>
<hook NAME="SummaryNode"/>
</node>
</node>
</node>
<node TEXT="The Git workflow" ID="ID_101583300" CREATED="1446488994756" MODIFIED="1446491290958" MOVED="1446489074393">
<hook NAME="AlwaysUnfoldedNode"/>
<node TEXT="GIT_8854158856954754767.png" ID="ID_108081249" CREATED="1446565834525" MODIFIED="1446565834525">
<hook URI="project://150C975AE0D1XFBR538UQS4YW64T3I4YD23F/../../../../Git/Git%20Traning%20Pic/GIT_8854158856954754767.png" SIZE="1.0" NAME="ExternalObject"/>
<node TEXT="A, B, C are sanpshots of the changes, not a single file" ID="ID_647597512" CREATED="1446565846931" MODIFIED="1446565901197" MOVED="1446565902931"/>
</node>
</node>
<node TEXT="Using hash values (SHA-1)" ID="ID_304315461" CREATED="1446488994756" MODIFIED="1446491290960" MOVED="1446489075546">
<hook NAME="AlwaysUnfoldedNode"/>
<node TEXT="Git generates a checksum for each change set" ID="ID_817730692" CREATED="1446565928353" MODIFIED="1446565964358">
<node TEXT="GIT_4423008371348462271.png" ID="ID_1425980171" CREATED="1446566099663" MODIFIED="1446566099663" MOVED="1446566107786">
<hook URI="project://150C975AE0D1XFBR538UQS4YW64T3I4YD23F/../../../../Git/Git%20Traning%20Pic/GIT_4423008371348462271.png" SIZE="0.9389671" NAME="ExternalObject"/>
</node>
</node>
<node TEXT="Changing data would change checksum" ID="ID_837556446" CREATED="1446565986837" MODIFIED="1446565999467"/>
</node>
<node TEXT="Working with the HEAD pointer" ID="ID_83606754" CREATED="1446488994756" MODIFIED="1446491290962" MOVED="1446489076804">
<hook NAME="AlwaysUnfoldedNode"/>
<node TEXT="Iit points at the place where we&apos;re going to start recording next. It&apos;s the place where we left off in our repository for the things that we&apos;ve committed." ID="ID_325933208" CREATED="1446566321406" MODIFIED="1446566340022">
<node TEXT="pointer to &quot;tip&quot; of current branch in repository" ID="ID_228932159" CREATED="1446566198077" MODIFIED="1446566677508" MOVED="1446566324006">
<hook NAME="FirstGroupNode"/>
</node>
<node TEXT="last state of repository, what was last check out" ID="ID_1993529175" CREATED="1446566342535" MODIFIED="1446566355371"/>
<node TEXT="points to parent of next commit" ID="ID_198047674" CREATED="1446566355632" MODIFIED="1446566459897"/>
<node TEXT="" ID="ID_1014974804" CREATED="1446566677501" MODIFIED="1446566677503">
<hook NAME="SummaryNode"/>
<node TEXT="GIT_6492297376902596994.png" ID="ID_521094827" CREATED="1446566684849" MODIFIED="1446566684849">
<hook URI="project://150C975AE0D1XFBR538UQS4YW64T3I4YD23F/../../../../Git/Git%20Traning%20Pic/GIT_6492297376902596994.png" SIZE="0.9463722" NAME="ExternalObject"/>
</node>
</node>
<node TEXT="GIT_1800668979164346563.png" ID="ID_1385612324" CREATED="1446566467093" MODIFIED="1446566467093">
<hook URI="project://150C975AE0D1XFBR538UQS4YW64T3I4YD23F/../../../../Git/Git%20Traning%20Pic/GIT_1800668979164346563.png" SIZE="1.0" NAME="ExternalObject"/>
<node TEXT="So HEAD always points to the tip of the currently checked out branch from the repository" ID="ID_1108325851" CREATED="1446566536077" MODIFIED="1446566671049"/>
</node>
</node>
<node ID="ID_942215051" CREATED="1446566770614" MODIFIED="1446566779319"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">git log HEAD</font>
    </p>
  </body>
</html>
</richcontent>
</node>
</node>
</node>
<node TEXT="5. Making Changes to Files" POSITION="right" ID="ID_1420459663" CREATED="1446488994756" MODIFIED="1446491290963">
<edge COLOR="#00007c"/>
<hook NAME="AlwaysUnfoldedNode"/>
<node TEXT="Adding files" ID="ID_1688138087" CREATED="1446488994762" MODIFIED="1446491290968" MOVED="1446491370683">
<hook NAME="AlwaysUnfoldedNode"/>
<node ID="ID_786400613" CREATED="1446566842772" MODIFIED="1446566848974"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">git status</font>
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_455191187" CREATED="1446567313395" MODIFIED="1446568491005"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">git log</font>
    </p>
  </body>
</html>
</richcontent>
</node>
</node>
<node TEXT="Editing files" ID="ID_245881149" CREATED="1446488994762" MODIFIED="1446491290970" MOVED="1446491371621">
<hook NAME="AlwaysUnfoldedNode"/>
</node>
<node TEXT="Viewing changes with diff" ID="ID_1997190825" CREATED="1446488994762" MODIFIED="1446491290972" MOVED="1446491372565">
<hook NAME="AlwaysUnfoldedNode"/>
<node ID="ID_1608039249" CREATED="1446568626516" MODIFIED="1446568841445"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">git diff</font>
    </p>
  </body>
</html>
</richcontent>
<node TEXT="Compare things in the working repositories" ID="ID_433351786" CREATED="1446568635053" MODIFIED="1446568778706"/>
</node>
</node>
<node TEXT="Viewing only staged changes" ID="ID_1604697783" CREATED="1446488994762" MODIFIED="1446491290974" MOVED="1446491373532">
<hook NAME="AlwaysUnfoldedNode"/>
<node ID="ID_952049419" CREATED="1446568842325" MODIFIED="1446568849911"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">git diff --staged</font>
    </p>
  </body>
</html>
</richcontent>
</node>
</node>
<node TEXT="Deleting files" ID="ID_1764817596" CREATED="1446488994762" MODIFIED="1446491290976" MOVED="1446491374461">
<hook NAME="AlwaysUnfoldedNode"/>
<node TEXT="1. Delete in Windows" ID="ID_90166580" CREATED="1446569117121" MODIFIED="1446569158830">
<node ID="ID_1314398232" CREATED="1446569158837" MODIFIED="1446569314543"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">git rm filename.txt</font>
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_1871445091" CREATED="1446569259707" MODIFIED="1446569312465"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">git commit -m &quot;message&quot;</font>
    </p>
  </body>
</html>
</richcontent>
</node>
</node>
<node ID="ID_1158709062" CREATED="1446569276524" MODIFIED="1446569297897"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      2. <font color="#0000ff">git rm fielname.txt</font>
    </p>
  </body>
</html>
</richcontent>
<node ID="ID_1495193123" CREATED="1446569297905" MODIFIED="1446569310016"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">git commit -m &quot;message &quot;</font>
    </p>
  </body>
</html>
</richcontent>
</node>
<node TEXT="Not in the trash anymore" ID="ID_1272579295" CREATED="1446569318424" MODIFIED="1446572973044"/>
</node>
</node>
<node TEXT="Moving and renaming files" ID="ID_923278586" CREATED="1446488994762" MODIFIED="1446491290874" MOVED="1446491375539">
<hook NAME="AlwaysUnfoldedNode"/>
<node TEXT="1. Git recognize it by default one delete and one add" ID="ID_156893421" CREATED="1446572977734" MODIFIED="1446573190837">
<node ID="ID_710867900" CREATED="1446572993072" MODIFIED="1446573190370" MOVED="1446573193260"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">git add newfilename</font>
    </p>
  </body>
</html>
</richcontent>
<hook NAME="FirstGroupNode"/>
</node>
<node ID="ID_248099748" CREATED="1446573036483" MODIFIED="1446573081423" MOVED="1446573193282"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">git rm oldfilename</font>
    </p>
  </body>
</html>
</richcontent>
</node>
</node>
<node ID="ID_1548714576" CREATED="1446573195431" MODIFIED="1446573258180"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      2. <font color="#0000ff">git mv oldfilename newfilename</font>
    </p>
  </body>
</html>
</richcontent>
<node TEXT="Change file name" ID="ID_624096899" CREATED="1446573240018" MODIFIED="1446573244076"/>
<node TEXT="Add it to staging index" ID="ID_659189681" CREATED="1446573244546" MODIFIED="1446573253613"/>
<node ID="ID_780219705" CREATED="1446573321784" MODIFIED="1446573338299"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">git mv oldfilename directory/newfilename</font>
    </p>
  </body>
</html>
</richcontent>
</node>
</node>
<node TEXT="If two files has more than threshold 50% similar, Git can recongnize it as change name" ID="ID_579126076" CREATED="1446573050872" MODIFIED="1446573181734">
<hook NAME="SummaryNode"/>
</node>
</node>
</node>
<node TEXT="6. Using Git with a Real Project" POSITION="right" ID="ID_769391733" CREATED="1446488994762" MODIFIED="1446491290979">
<edge COLOR="#7c007c"/>
<hook NAME="AlwaysUnfoldedNode"/>
<node TEXT="Introducing the Explore California web site" ID="ID_817648133" CREATED="1446488994766" MODIFIED="1446491290985" MOVED="1446491379189">
<hook NAME="AlwaysUnfoldedNode"/>
</node>
<node TEXT="Initializing Git" ID="ID_40552146" CREATED="1446488994766" MODIFIED="1446491290992" MOVED="1446491380062">
<hook NAME="AlwaysUnfoldedNode"/>
<node TEXT="Each projects are seperated" ID="ID_1500761847" CREATED="1446578392258" MODIFIED="1446579754678"/>
</node>
<node TEXT="Editing the support phone number" ID="ID_988611732" CREATED="1446488994766" MODIFIED="1446491290998" MOVED="1446491380890">
<hook NAME="AlwaysUnfoldedNode"/>
<node TEXT="GIT_1254822022297085606.png" ID="ID_825695002" CREATED="1446579759537" MODIFIED="1446579759537">
<hook URI="project://150C975AE0D1XFBR538UQS4YW64T3I4YD23F/../../../../Git/Git%20Traning%20Pic/GIT_1254822022297085606.png" SIZE="1.0" NAME="ExternalObject"/>
<node TEXT="Line 71, column 7" ID="ID_817129161" CREATED="1446579763896" MODIFIED="1446579920608"/>
</node>
<node ID="ID_1690347615" CREATED="1446579921339" MODIFIED="1446580012685"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">f, b</font>&#160;to go forward and backward
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_170465451" CREATED="1446580013306" MODIFIED="1446580030436"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">git diff --color-words filename</font>
    </p>
  </body>
</html>
</richcontent>
<node TEXT="This does the general diff software do" ID="ID_1925298374" CREATED="1446580032892" MODIFIED="1446580101754"/>
</node>
<node ID="ID_136777003" CREATED="1446580112233" MODIFIED="1446580131188"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">git commit -a</font>
    </p>
  </body>
</html>
</richcontent>
<node TEXT="Add everything in your working directory to staging index and commit" ID="ID_517439814" CREATED="1446580118042" MODIFIED="1446580173124"/>
<node TEXT="Adding and Deleting new file does NOT work well" ID="ID_1968427799" CREATED="1446580173942" MODIFIED="1446580190285"/>
</node>
</node>
<node TEXT="Editing the backpack file name and links" ID="ID_357493702" CREATED="1446488994766" MODIFIED="1446491291004" MOVED="1446491381660">
<hook NAME="AlwaysUnfoldedNode"/>
<node ID="ID_362423368" CREATED="1446580652850" MODIFIED="1446581656128"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">git add tours/</font>
    </p>
  </body>
</html>
</richcontent>
<hook NAME="FirstGroupNode"/>
</node>
<node ID="ID_922047060" CREATED="1446580660658" MODIFIED="1446581622908"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">git add tours/*</font>
    </p>
  </body>
</html>
</richcontent>
</node>
<node TEXT="Add everything in one directory" ID="ID_210093722" CREATED="1446580673543" MODIFIED="1446581586489">
<hook NAME="SummaryNode"/>
</node>
</node>
</node>
<node TEXT="7. Undoing Changes" POSITION="right" ID="ID_7787088" CREATED="1446488994766" MODIFIED="1446491291010" MOVED="1446491357593">
<edge COLOR="#7c7c00"/>
<hook NAME="AlwaysUnfoldedNode"/>
<node TEXT="Undoing working directory changes" ID="ID_183739145" CREATED="1446488994772" MODIFIED="1446491291014" MOVED="1446491334447">
<hook NAME="AlwaysUnfoldedNode"/>
<node ID="ID_1110099308" CREATED="1446581605067" MODIFIED="1446581621059"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">git checkout</font>
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_1032871293" CREATED="1446581682680" MODIFIED="1446581739667" MOVED="1446581704638"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">git checkout -- filename</font>
    </p>
  </body>
</html>
</richcontent>
<hook NAME="FirstGroupNode"/>
</node>
<node ID="ID_264263755" CREATED="1446581728564" MODIFIED="1446581775704"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">git checkout filename or folder name, </font><font color="#000000">not good as it will bring the branch if names are same</font>
    </p>
  </body>
</html>
</richcontent>
</node>
<node TEXT="" ID="ID_207063663" CREATED="1446581710862" MODIFIED="1446581715575">
<hook NAME="SummaryNode"/>
<node TEXT="not branch name, it file name" ID="ID_1507245629" CREATED="1446581693017" MODIFIED="1446581736072" MOVED="1446581714416"/>
</node>
</node>
<node TEXT="Unstaging files" ID="ID_990405208" CREATED="1446488994772" MODIFIED="1446491291020" MOVED="1446491335490">
<hook NAME="AlwaysUnfoldedNode"/>
<node ID="ID_189998452" CREATED="1446581949340" MODIFIED="1446581952086"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">git reset HEAD resources.html</font>
    </p>
  </body>
</html>
</richcontent>
</node>
</node>
<node TEXT="Amending commits" ID="ID_1563031785" CREATED="1446488994772" MODIFIED="1446491291026" MOVED="1446491359258">
<hook NAME="AlwaysUnfoldedNode"/>
<node ID="ID_1961913993" CREATED="1446582538296" MODIFIED="1446582557481"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">git commit --amend -m &quot;Rearrange the items to bring on a LA trip&quot;</font>
    </p>
  </body>
</html>
</richcontent>
<node TEXT="If one version has been committed, coder modify it again, coder need to add to staging index the new change then use this command to add the change" ID="ID_1646600217" CREATED="1446582559409" MODIFIED="1446582619763"/>
<node ID="ID_1036191080" CREATED="1446582621830" MODIFIED="1446582656643"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#ff0000">First commit message is discard by 2nd message </font>
    </p>
  </body>
</html>
</richcontent>
</node>
</node>
</node>
<node TEXT="Retrieving old versions" ID="ID_654865662" CREATED="1446488994772" MODIFIED="1446491291031" MOVED="1446491360204">
<hook NAME="AlwaysUnfoldedNode"/>
<node ID="ID_579151224" CREATED="1446582917060" MODIFIED="1446583003651"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">git log</font>&#160;to get every commit history, each commit is sanpshot of whole directory, so every file is there
    </p>
  </body>
</html>
</richcontent>
</node>
<node TEXT="copy the SHA-1, part of them is fine, just to be unique" ID="ID_1071295784" CREATED="1446582937653" MODIFIED="1446582958377"/>
<node ID="ID_305962193" CREATED="1446582958895" MODIFIED="1446583076177"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">git checkout 420d8b62825a718fbb3d4 -- filename</font>
    </p>
  </body>
</html>
</richcontent>
</node>
</node>
<node TEXT="Reverting a commit" ID="ID_1155387506" CREATED="1446488994772" MODIFIED="1446491291037" MOVED="1446491361368">
<hook NAME="AlwaysUnfoldedNode"/>
<node ID="ID_1124314731" CREATED="1446583868970" MODIFIED="1446584108706"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">git revert 20d8b62825a</font>
    </p>
  </body>
</html>
</richcontent>
<node TEXT="Git opens text editor for you" ID="ID_564010302" CREATED="1446583940703" MODIFIED="1446583999880"/>
<node TEXT="All working directories are still clean but Git does a new commit here" ID="ID_336670795" CREATED="1446584002516" MODIFIED="1446584105517"/>
</node>
</node>
<node TEXT="Using reset to undo commits" ID="ID_476016704" CREATED="1446488994772" MODIFIED="1446491291043" MOVED="1446491362480">
<hook NAME="AlwaysUnfoldedNode"/>
<node ID="ID_363439616" CREATED="1446584209011" MODIFIED="1446584242391"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">git reset</font>
    </p>
  </body>
</html>
</richcontent>
<node TEXT="soft: does not change staging index or working directory" ID="ID_433952619" CREATED="1446584214620" MODIFIED="1446584235125"/>
<node TEXT="mixed (default): change staging index to match repository, does not change working directory" ID="ID_264161583" CREATED="1446584243429" MODIFIED="1446584289283"/>
<node TEXT="hard: change staging index and working directory to match repository" ID="ID_406553100" CREATED="1446584290009" MODIFIED="1446584330071"/>
</node>
</node>
<node TEXT="Demonstrating a soft reset" ID="ID_1813817837" CREATED="1446488994772" MODIFIED="1446491291048" MOVED="1446491363384">
<hook NAME="AlwaysUnfoldedNode"/>
<node TEXT="Prepare" ID="ID_1400647495" CREATED="1446584602016" MODIFIED="1446584606346">
<node TEXT="GIT_4745620736164393126.png" ID="ID_1830620619" CREATED="1446584555189" MODIFIED="1446584555189" MOVED="1446584608521">
<hook URI="project://150C975AE0D1XFBR538UQS4YW64T3I4YD23F/../../../../Git/Git%20Traning%20Pic/GIT_4745620736164393126.png" SIZE="1.0" NAME="ExternalObject"/>
</node>
<node TEXT="GIT_4860022540647423703.png" ID="ID_485599930" CREATED="1446584572400" MODIFIED="1446584572400" MOVED="1446584609874">
<hook URI="project://150C975AE0D1XFBR538UQS4YW64T3I4YD23F/../../../../Git/Git%20Traning%20Pic/GIT_4860022540647423703.png" SIZE="1.0" NAME="ExternalObject"/>
</node>
<node TEXT="Copy Git log results to a seperated text file" ID="ID_651428830" CREATED="1446584580334" MODIFIED="1446584594084" MOVED="1446584611283"/>
</node>
<node ID="ID_1973632587" CREATED="1446584613576" MODIFIED="1446584743868"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">git reset --soft 20d8b62825a</font>
    </p>
  </body>
</html>
</richcontent>
<node TEXT="All the commits after SHA-1 stop are still in staging index" ID="ID_42267208" CREATED="1446584746195" MODIFIED="1446585081713"/>
</node>
</node>
<node TEXT="Demonstrating a mixed reset" ID="ID_213879762" CREATED="1446488994772" MODIFIED="1446491291054" MOVED="1446491364340">
<hook NAME="AlwaysUnfoldedNode"/>
<node ID="ID_433500134" CREATED="1446585084569" MODIFIED="1446585190103"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">git reset --mixed SHA-1</font>
    </p>
  </body>
</html>
</richcontent>
<node TEXT="Changes are in staing index, just undo commit" ID="ID_724817235" CREATED="1446585097824" MODIFIED="1446585174534"/>
</node>
</node>
<node TEXT="Demonstrating a hard reset" ID="ID_388503290" CREATED="1446488994772" MODIFIED="1446491291060" MOVED="1446491365725">
<hook NAME="AlwaysUnfoldedNode"/>
<node ID="ID_1279770846" CREATED="1446585511649" MODIFIED="1446585516241"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">git reset --hard f964a9c133f8f37</font>
    </p>
  </body>
</html>
</richcontent>
<node TEXT="everything is done, no git status items, but all changes are still in working repository" ID="ID_1144308735" CREATED="1446585518505" MODIFIED="1446585610707"/>
<node TEXT="HEAD pointer is move to older commit" ID="ID_980981050" CREATED="1446585610896" MODIFIED="1446585705278"/>
</node>
</node>
<node TEXT="Removing untracked files" ID="ID_1719628740" CREATED="1446488994772" MODIFIED="1446491291066" MOVED="1446491366914">
<hook NAME="AlwaysUnfoldedNode"/>
<node TEXT="git clean -n test run" ID="ID_1262650252" CREATED="1446588937023" MODIFIED="1446588944808"/>
<node ID="ID_1004610186" CREATED="1446588945006" MODIFIED="1446588956525"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">git clean -f</font>&#160;real run
    </p>
  </body>
</html>
</richcontent>
</node>
<node TEXT="Permenant delete" ID="ID_1764649640" CREATED="1446589019733" MODIFIED="1446649003868"/>
</node>
</node>
<node TEXT="8. Ignoring Files" POSITION="right" ID="ID_448540977" CREATED="1446488994772" MODIFIED="1446491291072">
<edge COLOR="#0000ff"/>
<hook NAME="AlwaysUnfoldedNode"/>
<node TEXT="Using .gitignore files" ID="ID_1203780203" CREATED="1446488994778" MODIFIED="1446491291077" MOVED="1446491385409">
<hook NAME="AlwaysUnfoldedNode"/>
<node TEXT="Tell Git which files it ought to ignore" ID="ID_1802715550" CREATED="1446649006143" MODIFIED="1446649018271"/>
<node TEXT="Project/.gitignore" ID="ID_355896144" CREATED="1446649018469" MODIFIED="1446649108670">
<node TEXT="Name of file, seperated by line" ID="ID_1570592690" CREATED="1446649116936" MODIFIED="1446649169967"/>
<node TEXT="Regular expression" ID="ID_53321147" CREATED="1446649140078" MODIFIED="1446649146800"/>
<node TEXT="Negate expression, i.e. *.php" ID="ID_1939041520" CREATED="1446649147029" MODIFIED="1446649166646">
<node TEXT="!index.php : Do NOT ignore index.php" ID="ID_568694377" CREATED="1446649190551" MODIFIED="1446649209953"/>
</node>
<node TEXT="Ignore all files in a directory with trailing slash, i.e. assets/videos/" ID="ID_1907380931" CREATED="1446649211197" MODIFIED="1446649386237"/>
<node TEXT="Comment &quot;#&quot;" ID="ID_1312264362" CREATED="1446649636599" MODIFIED="1446649911310"/>
</node>
<node TEXT="notepad .gitignore" ID="ID_1708241283" CREATED="1446649388287" MODIFIED="1446649400190">
<node TEXT="Use notepad text editor to create .gitignore file" ID="ID_1304668708" CREATED="1446649400200" MODIFIED="1446649556040"/>
<node ID="ID_1789717220" CREATED="1446649557369" MODIFIED="1446650273639"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      If .gitignore is <font color="#ff0000">under project</font>, everyone uses this configuration
    </p>
  </body>
</html>
</richcontent>
</node>
</node>
</node>
<node TEXT="Understanding what to ignore" ID="ID_1291594668" CREATED="1446488994779" MODIFIED="1446491291084" MOVED="1446491388670">
<hook NAME="AlwaysUnfoldedNode"/>
<node TEXT="Compiled Source Code" ID="ID_727686209" CREATED="1446649912316" MODIFIED="1446649926990"/>
<node TEXT="Packages and Compressed Files" ID="ID_933044920" CREATED="1446649928021" MODIFIED="1446649958185"/>
<node TEXT="Log s and databases" ID="ID_637065728" CREATED="1446649958647" MODIFIED="1446649973980"/>
<node TEXT="Operating System Generated Files" ID="ID_363446742" CREATED="1446649974816" MODIFIED="1446649989741"/>
<node TEXT="User-uploaded assets (Images, PDFs, videos)" ID="ID_895740784" CREATED="1446649992985" MODIFIED="1446650095517"/>
<node TEXT="https://github.com/github/gitignore" ID="ID_1301172175" CREATED="1446650096914" MODIFIED="1446650259833"/>
</node>
<node TEXT="Ignoring files globally" ID="ID_431819140" CREATED="1446488994779" MODIFIED="1446491291090" MOVED="1446491389605">
<hook NAME="AlwaysUnfoldedNode"/>
<node TEXT="ignore files in all repositories, it&apos;s not inside any repositories" ID="ID_1040641090" CREATED="1446650299528" MODIFIED="1446650399049"/>
<node ID="ID_651135780" CREATED="1446650399488" MODIFIED="1446650421241"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">git config --global core.excludesfile ~/.gitignore_global</font>
    </p>
  </body>
</html>
</richcontent>
<node TEXT="This file can be placed anywhere, we need to tell Git where to find it" ID="ID_781576941" CREATED="1446650448154" MODIFIED="1446650607203"/>
<node TEXT="We can find the path in .gitconfig, mine is located on H driver" ID="ID_859667622" CREATED="1446650610127" MODIFIED="1446650880947"/>
</node>
</node>
<node TEXT="Ignoring tracked files" ID="ID_983947653" CREATED="1446488994779" MODIFIED="1446491291096" MOVED="1446491390599">
<hook NAME="AlwaysUnfoldedNode"/>
<node ID="ID_873230318" CREATED="1446650882003" MODIFIED="1446651069903"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      Git won't ignore the file which has already been tracked, even it's satisfied the rule, so if we modify this file again, it still show modification in <font color="#0000ff">git status</font>
    </p>
  </body>
</html>
</richcontent>
<node ID="ID_11952524" CREATED="1446651107475" MODIFIED="1446651197010"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">git rm --cached filename</font>
    </p>
  </body>
</html>
</richcontent>
<node TEXT="Remove the file from tracking index, not the file" ID="ID_284815438" CREATED="1446651122988" MODIFIED="1446651139350"/>
</node>
</node>
</node>
<node TEXT="Tracking empty directories" ID="ID_1269300254" CREATED="1446488994779" MODIFIED="1446491291102" MOVED="1446491391805">
<hook NAME="AlwaysUnfoldedNode"/>
<node TEXT="Git is not tracking empty directories unless there is file in it" ID="ID_288134383" CREATED="1446651303529" MODIFIED="1446651418215">
<node ID="ID_1767668074" CREATED="1446651420979" MODIFIED="1446651555218"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      Create a .<font color="#0000ff">gitkeep </font>empty file
    </p>
  </body>
</html>
</richcontent>
</node>
<node TEXT="touch filename, create a file with empty content" ID="ID_1862590614" CREATED="1446651444523" MODIFIED="1446651467711"/>
</node>
</node>
</node>
<node TEXT="9. Navigating the Commit Tree" POSITION="right" ID="ID_1251588935" CREATED="1446488994779" MODIFIED="1446491291108">
<edge COLOR="#ff00ff"/>
<hook NAME="AlwaysUnfoldedNode"/>
<node TEXT="Referencing commits" ID="ID_1870264795" CREATED="1446488994784" MODIFIED="1446491291113" MOVED="1446491325725">
<hook NAME="AlwaysUnfoldedNode"/>
<node TEXT="Tree-ish is a reference to a commit" ID="ID_1237724387" CREATED="1446651556324" MODIFIED="1446651631560">
<node TEXT="full SHA-1 hash" ID="ID_24575263" CREATED="1446651642394" MODIFIED="1446651659221"/>
<node TEXT="short SHA-a hash" ID="ID_527567295" CREATED="1446651659484" MODIFIED="1446651671669">
<node TEXT="at lease 4 characters" ID="ID_393334705" CREATED="1446651671674" MODIFIED="1446651680551"/>
<node TEXT="unambiguous (8-10 characters)" ID="ID_1608217066" CREATED="1446651680813" MODIFIED="1446651707233"/>
</node>
<node TEXT="HEAD pointer" ID="ID_798986243" CREATED="1446651708775" MODIFIED="1446651716921"/>
<node TEXT="branch reference, tag reference" ID="ID_1379999850" CREATED="1446651717121" MODIFIED="1446651737339"/>
<node TEXT="ancestry" ID="ID_1824763822" CREATED="1446651737506" MODIFIED="1446651748970">
<node TEXT="parent commit" ID="ID_1754277928" CREATED="1446651748977" MODIFIED="1446651760644">
<node TEXT="HEAD^, acf8756^, master^, (caret)" ID="ID_52823782" CREATED="1446651760650" MODIFIED="1446652042528"/>
<node TEXT="HEAD~, HEAD~1, (tail)" ID="ID_859844553" CREATED="1446651782885" MODIFIED="1446652071527"/>
</node>
<node TEXT="grandparent commit" ID="ID_794114752" CREATED="1446651915735" MODIFIED="1446651923632">
<node TEXT="HEAD^^, acf8756^^, master^^" ID="ID_150248646" CREATED="1446651760650" MODIFIED="1446651970248"/>
<node TEXT="HEAD~2" ID="ID_1805618790" CREATED="1446651782885" MODIFIED="1446652000418"/>
</node>
<node TEXT="greate-grandparent commit" ID="ID_1932273283" CREATED="1446651971011" MODIFIED="1446651980789">
<node TEXT="HEAD^^^, acf8756^^^, master^^^" ID="ID_263889570" CREATED="1446651760650" MODIFIED="1446651990670"/>
<node TEXT="HEAD~3" ID="ID_1868104134" CREATED="1446651782885" MODIFIED="1446652035728"/>
</node>
</node>
</node>
</node>
<node TEXT="Exploring tree listings" ID="ID_1958837460" CREATED="1446488994784" MODIFIED="1446491291119" MOVED="1446491326545">
<hook NAME="AlwaysUnfoldedNode"/>
<node ID="ID_1068144227" CREATED="1446652102205" MODIFIED="1446652177273"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">git ls-tree HEAD</font>
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_1271096725" CREATED="1446652180178" MODIFIED="1446652193053"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">git ls-tree master</font>
    </p>
  </body>
</html>
</richcontent>
<node TEXT="git ls-tree master assets/" ID="ID_1235308248" CREATED="1446652194819" MODIFIED="1446652217982"/>
<node TEXT="git ls-tree master^ assets/" ID="ID_1784200224" CREATED="1446652241791" MODIFIED="1446652338123"/>
</node>
<node ID="ID_1088581395" CREATED="1446652339854" MODIFIED="1446652368838"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">git ls-tree SHA-1 number</font>
    </p>
  </body>
</html>
</richcontent>
</node>
</node>
<node TEXT="Getting more from the commit log" ID="ID_183950773" CREATED="1446488994784" MODIFIED="1446491291125" MOVED="1446491327365">
<hook NAME="AlwaysUnfoldedNode"/>
<node ID="ID_1983237369" CREATED="1446652446190" MODIFIED="1446652485087"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">git log --oneline</font>
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_1436417293" CREATED="1446652485977" MODIFIED="1446652504435"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">git log -4, </font><font color="#000000">list last 4 log</font>
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_621689213" CREATED="1446652509323" MODIFIED="1446652609494"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">git log --since=&quot;2015-10-10&quot;</font>, and until, after, before
    </p>
  </body>
</html>
</richcontent>
<node TEXT="&quot;3 weeks ago&quot;, &quot;2 days ago&quot;, &quot;3.days&quot;" ID="ID_594437426" CREATED="1446652609502" MODIFIED="1446652635346"/>
</node>
<node ID="ID_1350609140" CREATED="1446652636245" MODIFIED="1446652674866"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">git log --author=&quot;frank&quot;</font>
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_1421428123" CREATED="1446652675095" MODIFIED="1446652715284"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">git log --grep=&quot;temp&quot;</font>
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_348923791" CREATED="1446652715530" MODIFIED="1446652753688"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">git log SHA-1..SHA-1 --oneline</font>
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_1083256663" CREATED="1446652753884" MODIFIED="1446652779667"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">git log SHA-1.. filename</font>
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_609217021" CREATED="1446652780143" MODIFIED="1446653070322"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">git log SHA-1.. filename -p</font><font color="#000000">, show oen file difference</font>
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_239642154" CREATED="1446653071308" MODIFIED="1446653167637"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">git log --stat --summary</font>
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_1466730251" CREATED="1446653168667" MODIFIED="1446653289570"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">git log --graph</font>
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_332963426" CREATED="1446653212166" MODIFIED="1446653215161"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">git log --oneline --graph --all --decorate</font>
    </p>
  </body>
</html>
</richcontent>
</node>
</node>
<node TEXT="Viewing commits" ID="ID_776323481" CREATED="1446488994784" MODIFIED="1446491291132" MOVED="1446491328455">
<hook NAME="AlwaysUnfoldedNode"/>
<node ID="ID_1374335301" CREATED="1446653359041" MODIFIED="1446653366026"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">git show SHA-1</font>
    </p>
  </body>
</html>
</richcontent>
<node TEXT="show full comit difference between files" ID="ID_1200862276" CREATED="1446653371522" MODIFIED="1446653595888"/>
</node>
</node>
<node TEXT="Comparing commits" ID="ID_1367935775" CREATED="1446488994784" MODIFIED="1446491291138" MOVED="1446491329519">
<hook NAME="AlwaysUnfoldedNode"/>
<node ID="ID_257598226" CREATED="1446653672016" MODIFIED="1446653712876"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">git diff</font>
    </p>
  </body>
</html>
</richcontent>
<node TEXT="Difference between working directories and staging index" ID="ID_1070062568" CREATED="1446653676068" MODIFIED="1446653759333"/>
</node>
<node ID="ID_1687960342" CREATED="1446653701394" MODIFIED="1446653710610"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">git diff -cached</font>
    </p>
  </body>
</html>
</richcontent>
<node TEXT="Difference between staging index and repo or HEAD" ID="ID_1171070821" CREATED="1446653714604" MODIFIED="1446655922648"/>
</node>
<node ID="ID_736877235" CREATED="1446655923430" MODIFIED="1446656042645"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">git diff SHA-1</font>
    </p>
  </body>
</html>
</richcontent>
<node TEXT="Difference between this promotion and current directories" ID="ID_1413994158" CREATED="1446655967980" MODIFIED="1446655983824"/>
</node>
<node ID="ID_891986619" CREATED="1446656043799" MODIFIED="1446656280033"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">git diff SHA-1..SHA-1</font>
    </p>
  </body>
</html>
</richcontent>
</node>
</node>
</node>
<node TEXT="10. Branching" POSITION="right" ID="ID_1274197" CREATED="1446488994784" MODIFIED="1446491291144">
<edge COLOR="#ffff00"/>
<hook NAME="AlwaysUnfoldedNode"/>
<node TEXT="Branching overview" ID="ID_468879112" CREATED="1446488994789" MODIFIED="1446491291148" MOVED="1446491395628">
<hook NAME="AlwaysUnfoldedNode"/>
<node TEXT="Branches are cheap" ID="ID_663549172" CREATED="1446656316963" MODIFIED="1446656455982">
<node TEXT="HEAD pointer always points to current branch" ID="ID_1297851517" CREATED="1446656455989" MODIFIED="1446656569892">
<node TEXT="GIT_2105960506083472207.png" ID="ID_301541649" CREATED="1446656574166" MODIFIED="1446656574166">
<hook URI="project://150C975AE0D1XFBR538UQS4YW64T3I4YD23F/../../../../Git/Git%20Traning%20Pic/GIT_2105960506083472207.png" SIZE="1.0" NAME="ExternalObject"/>
</node>
</node>
</node>
</node>
<node TEXT="Viewing and creating branches" ID="ID_1432793218" CREATED="1446488994789" MODIFIED="1446491291154" MOVED="1446491396554">
<hook NAME="AlwaysUnfoldedNode"/>
<node ID="ID_635331069" CREATED="1446656622074" MODIFIED="1446656631145"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">git branch</font>
    </p>
  </body>
</html>
</richcontent>
<node TEXT="Where the HEAD points to" ID="ID_1636787414" CREATED="1446656632387" MODIFIED="1446656644429"/>
<node ID="ID_1849008479" CREATED="1446656644731" MODIFIED="1446656730347"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">cat .git/HEAD</font>
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_648071205" CREATED="1446656712505" MODIFIED="1446656727322"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">ls -al .git/refs/heads</font>
    </p>
  </body>
</html>
</richcontent>
</node>
</node>
<node ID="ID_602470857" CREATED="1446656796126" MODIFIED="1446656871826"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">git branch new_feature</font>
    </p>
  </body>
</html>
</richcontent>
<node TEXT="Create a new feature branch, but HEAD is still pointing to master branch" ID="ID_1277111340" CREATED="1446656807482" MODIFIED="1446656841743"/>
<node TEXT="New refs in .git/refs/heads" ID="ID_608686013" CREATED="1446656844378" MODIFIED="1446656869237"/>
</node>
</node>
<node TEXT="Switching branches" ID="ID_1048590982" CREATED="1446488994789" MODIFIED="1446491291160" MOVED="1446491397376">
<hook NAME="AlwaysUnfoldedNode"/>
<node ID="ID_1028451836" CREATED="1446656928176" MODIFIED="1446656936223"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">git checkout new_feature</font>
    </p>
  </body>
</html>
</richcontent>
<node TEXT="switch branches will change the modification of codes in working directories" ID="ID_1923401137" CREATED="1446657058892" MODIFIED="1446657620329"/>
</node>
</node>
<node TEXT="Creating and switching branches" ID="ID_1871534816" CREATED="1446488994789" MODIFIED="1446491291167" MOVED="1446491398218">
<hook NAME="AlwaysUnfoldedNode"/>
<node ID="ID_1641480404" CREATED="1446657621966" MODIFIED="1446657900891"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">git checkout -b branchName</font>
    </p>
  </body>
</html>
</richcontent>
<node TEXT="create branch and switch to it" ID="ID_774165210" CREATED="1446657627489" MODIFIED="1446657637959"/>
</node>
<node ID="ID_468846989" CREATED="1446657915764" MODIFIED="1446657932803"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">git checkout --filename</font>
    </p>
  </body>
</html>
</richcontent>
<node TEXT="checkout only the file" ID="ID_1192144203" CREATED="1446657922078" MODIFIED="1446657930772"/>
</node>
<node ID="ID_1688972125" CREATED="1446657990834" MODIFIED="1446658315672"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">git log --graph --oneline --decorate --all</font>
    </p>
  </body>
</html>
</richcontent>
</node>
</node>
<node TEXT="Switching branches with uncommitted changes" ID="ID_1216653912" CREATED="1446488994789" MODIFIED="1446491291173" MOVED="1446491399317">
<hook NAME="AlwaysUnfoldedNode"/>
</node>
<node TEXT="Comparing branches" ID="ID_848637805" CREATED="1446488994789" MODIFIED="1446491291179" MOVED="1446491400576">
<hook NAME="AlwaysUnfoldedNode"/>
<node ID="ID_117579654" CREATED="1446658317305" MODIFIED="1446658332995"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">git branch master..new_feature</font>
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_1546295448" CREATED="1446658442427" MODIFIED="1446658524814"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">git branch master..new_feature^</font>
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_1280977681" CREATED="1446658528361" MODIFIED="1446658545794"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">git branch --merged</font>
    </p>
  </body>
</html>
</richcontent>
</node>
</node>
<node TEXT="Renaming branches" ID="ID_1289345286" CREATED="1446488994789" MODIFIED="1446491291184" MOVED="1446491402883">
<hook NAME="AlwaysUnfoldedNode"/>
<node ID="ID_1169937862" CREATED="1446658674220" MODIFIED="1446658688509"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">git branch -m new_feature seo_title</font>
    </p>
  </body>
</html>
</richcontent>
</node>
</node>
<node TEXT="Deleting branches" ID="ID_156751294" CREATED="1446488994789" MODIFIED="1446491291192" MOVED="1446491403798">
<hook NAME="AlwaysUnfoldedNode"/>
<node ID="ID_738061760" CREATED="1446658778060" MODIFIED="1446658991325"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">git branch -d branchname</font>
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_760628736" CREATED="1446658787395" MODIFIED="1446658969515"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">git branch --delete branchname</font>
    </p>
  </body>
</html>
</richcontent>
</node>
<node TEXT="Can not delete branch where you are currently on" ID="ID_1238058845" CREATED="1446658841497" MODIFIED="1446658917744"/>
<node TEXT="Can not delete branch where are merge is not done" ID="ID_924419863" CREATED="1446658917982" MODIFIED="1446658935480">
<node ID="ID_708637947" CREATED="1446658935488" MODIFIED="1446658963808"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">git branch -D branchname</font>, force to delete
    </p>
  </body>
</html>
</richcontent>
</node>
</node>
</node>
<node TEXT="Configuring the command prompt to show the branch" ID="ID_1436330142" CREATED="1446488994789" MODIFIED="1446491291198" MOVED="1446491405150">
<hook NAME="AlwaysUnfoldedNode"/>
</node>
</node>
<node TEXT="11. Merging Branches" POSITION="right" ID="ID_1239722455" CREATED="1446488994789" MODIFIED="1446491291204">
<edge COLOR="#00007c"/>
<hook NAME="AlwaysUnfoldedNode"/>
<node TEXT="Merging code" ID="ID_1684715214" CREATED="1446488994793" MODIFIED="1446491291208" MOVED="1446491419445">
<hook NAME="AlwaysUnfoldedNode"/>
<node TEXT="From the branch which will receive the merge" ID="ID_1396193243" CREATED="1446697176538" MODIFIED="1446697194101">
<node TEXT="git merge -branch name" ID="ID_139561371" CREATED="1446697194117" MODIFIED="1446698952735"/>
<node TEXT="git diff branch --merge" ID="ID_1430127273" CREATED="1446698952906" MODIFIED="1446701319516"/>
</node>
</node>
<node TEXT="Using fast-forward merge vs. true merge" ID="ID_1512596341" CREATED="1446488994793" MODIFIED="1446491291214" MOVED="1446491420164">
<hook NAME="AlwaysUnfoldedNode"/>
<node TEXT="Fast-forward merge" ID="ID_177616313" CREATED="1446701404927" MODIFIED="1446701612750">
<node ID="ID_1536736028" CREATED="1446701614063" MODIFIED="1446701678879"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      force true merge <font color="#0000ff">git merge --no--ff branch</font>
    </p>
  </body>
</html>
</richcontent>
</node>
<node ID="ID_688307863" CREATED="1446701678941" MODIFIED="1446702048961"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      do fast-forward merge if it's possible <font color="#0000ff">git merge --ff_only branch</font>
    </p>
  </body>
</html>
</richcontent>
</node>
<node TEXT="No commit" ID="ID_755772017" CREATED="1446701648346" MODIFIED="1446701666613"/>
</node>
<node TEXT="true merge" ID="ID_91005550" CREATED="1446702049774" MODIFIED="1446702053852">
<node TEXT="git merge fielname" ID="ID_737481174" CREATED="1446702053868" MODIFIED="1446702062134"/>
</node>
<node TEXT="If master branch has not change after other branch wants to merge it, it prefers fast-forward merge" ID="ID_1955447463" CREATED="1446702063024" MODIFIED="1446703091802"/>
</node>
<node TEXT="Merging conflicts" ID="ID_389514332" CREATED="1446488994793" MODIFIED="1446491291221" MOVED="1446491422064">
<hook NAME="AlwaysUnfoldedNode"/>
<node ID="ID_1725086815" CREATED="1446703095021" MODIFIED="1446703102631"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">git merge filename</font>
    </p>
  </body>
</html>
</richcontent>
<node TEXT="Once merge has conflict, you are in the conflict merge branch, in the middle of two branches" ID="ID_1050843574" CREATED="1446703102646" MODIFIED="1446703180932"/>
<node TEXT="Open the file, Git will mark the conflicts" ID="ID_72926990" CREATED="1446703181135" MODIFIED="1446703220324"/>
</node>
</node>
<node TEXT="Resolving merge conflicts" ID="ID_585312272" CREATED="1446488994793" MODIFIED="1446491291228" MOVED="1446491424263">
<hook NAME="AlwaysUnfoldedNode"/>
<node TEXT="Abort merge" ID="ID_1413551761" CREATED="1446703236403" MODIFIED="1446703242310">
<node ID="ID_112361094" CREATED="1446703285187" MODIFIED="1446703635404"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      In the middle branch, <font color="#0000ff">git merge --abort</font>
    </p>
  </body>
</html>
</richcontent>
</node>
</node>
<node TEXT="Resolve conflicts manually" ID="ID_615883094" CREATED="1446703242638" MODIFIED="1446703261327"/>
<node TEXT="Use a merge tool" ID="ID_786375338" CREATED="1446703250404" MODIFIED="1446703284281">
<node ID="ID_427174127" CREATED="1446703636404" MODIFIED="1446703712198"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">git mergetool --tool=toolname</font>
    </p>
  </body>
</html>
</richcontent>
</node>
</node>
</node>
<node TEXT="Exploring strategies to reduce merge conflicts" ID="ID_903699488" CREATED="1446488994793" MODIFIED="1446491291235" MOVED="1446491425425">
<hook NAME="AlwaysUnfoldedNode"/>
<node TEXT="Keep lines short" ID="ID_1530797151" CREATED="1446703713630" MODIFIED="1446703734002"/>
<node TEXT="Keep commits small and focused" ID="ID_1774454254" CREATED="1446703739672" MODIFIED="1446703765272"/>
<node TEXT="Beware stray edits to whitesapce" ID="ID_623332769" CREATED="1446703765876" MODIFIED="1446703797011"/>
<node TEXT="Merge often" ID="ID_1501921472" CREATED="1446703786093" MODIFIED="1446703863891"/>
<node TEXT="" ID="ID_985595521" CREATED="1446703864083" MODIFIED="1446703864083"/>
</node>
</node>
<node TEXT="12. Stashing Changes" POSITION="right" ID="ID_1084824279" CREATED="1446488994793" MODIFIED="1446491291240">
<edge COLOR="#7c007c"/>
<hook NAME="AlwaysUnfoldedNode"/>
<node TEXT="Saving changes in the stash" ID="ID_1296719601" CREATED="1446488994797" MODIFIED="1446491291245" MOVED="1446491489812">
<hook NAME="AlwaysUnfoldedNode"/>
<node ID="ID_818192678" CREATED="1446779253989" MODIFIED="1446779418108"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">git stash save &quot;comment&quot;</font>
    </p>
  </body>
</html>

</richcontent>
</node>
</node>
<node TEXT="Viewing stashed changes" ID="ID_1433833816" CREATED="1446488994797" MODIFIED="1446491291251" MOVED="1446491491789">
<hook NAME="AlwaysUnfoldedNode"/>
<node ID="ID_1873895919" CREATED="1446779419012" MODIFIED="1446779506681"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">git stash list</font>
    </p>
  </body>
</html>

</richcontent>
</node>
<node ID="ID_157908249" CREATED="1446779506867" MODIFIED="1446779533587"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">git stash show &quot;stashNumber&quot;</font>
    </p>
  </body>
</html>

</richcontent>
</node>
<node ID="ID_1977280111" CREATED="1446779534052" MODIFIED="1446781207291"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">git stash show -p &quot;stashNumber&quot;</font>
    </p>
  </body>
</html>

</richcontent>
</node>
</node>
<node TEXT="Retrieving stashed changes" ID="ID_1743405797" CREATED="1446488994797" MODIFIED="1446491291256" MOVED="1446491492898">
<hook NAME="AlwaysUnfoldedNode"/>
<node ID="ID_1335591241" CREATED="1446781208805" MODIFIED="1446781223385"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">git stash pop</font>
    </p>
  </body>
</html>

</richcontent>
<node TEXT="copy to local and delete in stash" ID="ID_217774765" CREATED="1446781224464" MODIFIED="1446781237911"/>
<node ID="ID_666696304" CREATED="1446781293767" MODIFIED="1446781507231"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      By default it pulls the first one, or we can configure the name, <font color="#0000ff">git stash pop &quot;stashNumber&quot;</font>
    </p>
  </body>
</html>

</richcontent>
</node>
</node>
<node ID="ID_637105484" CREATED="1446781212689" MODIFIED="1446781221356"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">git stash apply</font>
    </p>
  </body>
</html>

</richcontent>
<node TEXT="copy to local only" ID="ID_749614910" CREATED="1446781238813" MODIFIED="1446781293100"/>
</node>
</node>
<node TEXT="Deleting stashed changes" ID="ID_1402947745" CREATED="1446488994797" MODIFIED="1446491291263" MOVED="1446491493810">
<hook NAME="AlwaysUnfoldedNode"/>
<node ID="ID_890894580" CREATED="1446781508038" MODIFIED="1446781522954"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">git stash drop &quot;stashNumber&quot;</font>
    </p>
  </body>
</html>

</richcontent>
<node TEXT="Delete stash item" ID="ID_668512901" CREATED="1446781524561" MODIFIED="1446781736103"/>
</node>
<node ID="ID_1151218049" CREATED="1446781736643" MODIFIED="1446781981618"><richcontent TYPE="NODE">

<html>
  <head>
    
  </head>
  <body>
    <p>
      <font color="#0000ff">git stash clear</font>
    </p>
  </body>
</html>

</richcontent>
</node>
</node>
</node>
<node TEXT="13. Remotes" POSITION="right" ID="ID_1452742774" CREATED="1446488994797" MODIFIED="1446491291269">
<edge COLOR="#7c7c00"/>
<hook NAME="AlwaysUnfoldedNode"/>
<node TEXT="Using local and remote repositories" ID="ID_380087147" CREATED="1446488994802" MODIFIED="1446491291273" MOVED="1446491535824">
<hook NAME="AlwaysUnfoldedNode"/>
<node TEXT="push" ID="ID_1110002937" CREATED="1446781984096" MODIFIED="1446781985888"/>
<node TEXT="fetch" ID="ID_1122040847" CREATED="1446781986302" MODIFIED="1446781988139"/>
<node TEXT="merge" ID="ID_579203621" CREATED="1446782033484" MODIFIED="1446782069415"/>
<node TEXT="remote server, origin master, master" ID="ID_1441705731" CREATED="1446782070162" MODIFIED="1446782366540"/>
<node TEXT="process: Do my work on master branch, and commit, then do fetch from remote server, do a merge between origin branch and my master branch, then push to remote server" ID="ID_529959223" CREATED="1446782366743" MODIFIED="1446783085858"/>
</node>
<node TEXT="Setting up a GitHub account" ID="ID_1832428418" CREATED="1446488994802" MODIFIED="1446491291280" MOVED="1446491535827">
<hook NAME="AlwaysUnfoldedNode"/>
</node>
<node TEXT="Adding a remote repository" ID="ID_726283363" CREATED="1446488994802" MODIFIED="1446491291286" MOVED="1446491535830">
<hook NAME="AlwaysUnfoldedNode"/>
<node TEXT="" ID="ID_814219572" CREATED="1446783086639" MODIFIED="1446783086639"/>
</node>
<node TEXT="Creating a remote branch" ID="ID_1379931523" CREATED="1446488994802" MODIFIED="1446491291293" MOVED="1446491535832">
<hook NAME="AlwaysUnfoldedNode"/>
</node>
<node TEXT="Cloning a remote repository" ID="ID_993319002" CREATED="1446488994802" MODIFIED="1446491291298" MOVED="1446491535835">
<hook NAME="AlwaysUnfoldedNode"/>
</node>
<node TEXT="Tracking remote branches" ID="ID_1643896653" CREATED="1446488994802" MODIFIED="1446491291305" MOVED="1446491535837">
<hook NAME="AlwaysUnfoldedNode"/>
</node>
<node TEXT="Pushing changes to a remote repository" ID="ID_106256805" CREATED="1446488994802" MODIFIED="1446491291311" MOVED="1446491535839">
<hook NAME="AlwaysUnfoldedNode"/>
</node>
<node TEXT="Fetching changes from a remote repository" ID="ID_1562375213" CREATED="1446488994802" MODIFIED="1446491291317" MOVED="1446491535841">
<hook NAME="AlwaysUnfoldedNode"/>
</node>
<node TEXT="Merging in fetched changes" ID="ID_470505219" CREATED="1446488994802" MODIFIED="1446491291323" MOVED="1446491535843">
<hook NAME="AlwaysUnfoldedNode"/>
</node>
<node TEXT="Checking out remote branches" ID="ID_1149054868" CREATED="1446488994802" MODIFIED="1446491291329" MOVED="1446491535845">
<hook NAME="AlwaysUnfoldedNode"/>
</node>
<node TEXT="Pushing to an updated remote branch" ID="ID_870206200" CREATED="1446488994802" MODIFIED="1446491291336" MOVED="1446491535845">
<hook NAME="AlwaysUnfoldedNode"/>
</node>
<node TEXT="Deleting a remote branch" ID="ID_1146665460" CREATED="1446488994802" MODIFIED="1446491291341" MOVED="1446491535846">
<hook NAME="AlwaysUnfoldedNode"/>
</node>
<node TEXT="Enabling collaboration" ID="ID_616302325" CREATED="1446488994802" MODIFIED="1446491291348" MOVED="1446491535847">
<hook NAME="AlwaysUnfoldedNode"/>
</node>
<node TEXT="A collaboration workflow" ID="ID_926456497" CREATED="1446488994802" MODIFIED="1446491291354" MOVED="1446491535855">
<hook NAME="AlwaysUnfoldedNode"/>
</node>
</node>
<node TEXT="14. Tools and Next Steps" POSITION="right" ID="ID_876156027" CREATED="1446488994802" MODIFIED="1446491291360">
<edge COLOR="#0000ff"/>
<hook NAME="AlwaysUnfoldedNode"/>
<node TEXT="Setting up aliases for common commands" ID="ID_1942950542" CREATED="1446488994806" MODIFIED="1446491291364" MOVED="1446491482316">
<hook NAME="AlwaysUnfoldedNode"/>
</node>
<node TEXT="Using SSH keys for remote login" ID="ID_217344006" CREATED="1446488994806" MODIFIED="1446491291369" MOVED="1446491483371">
<hook NAME="AlwaysUnfoldedNode"/>
</node>
<node TEXT="Exploring integrated development environments" ID="ID_978605511" CREATED="1446488994806" MODIFIED="1446491291375" MOVED="1446491484268">
<hook NAME="AlwaysUnfoldedNode"/>
</node>
<node TEXT="Exploring graphical user interfaces" ID="ID_816483527" CREATED="1446488994806" MODIFIED="1446491291381" MOVED="1446491485203">
<hook NAME="AlwaysUnfoldedNode"/>
</node>
<node TEXT="Understanding Git hosting" ID="ID_161494146" CREATED="1446488994806" MODIFIED="1446491291387" MOVED="1446491486245">
<hook NAME="AlwaysUnfoldedNode"/>
</node>
</node>
<node TEXT="Conclusion" POSITION="right" ID="ID_976359782" CREATED="1446488994806" MODIFIED="1446491291393" MOVED="1446491477231">
<edge COLOR="#ff00ff"/>
<hook NAME="AlwaysUnfoldedNode"/>
</node>
<node TEXT="Goodbye" POSITION="right" ID="ID_1455717676" CREATED="1446488994809" MODIFIED="1446491475368" MOVED="1446491475375">
<hook NAME="AlwaysUnfoldedNode"/>
<edge COLOR="#ffff00"/>
</node>
</node>
</map>
