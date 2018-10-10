import Line.PhoneBill;
import Line.Taks2;
import Arcade.CommonCharacterCount;
import Arcade.IsLucky;
import Arcade.ReverseParenthese;
import Arcade.SortByHeight;
import Challenge.KBonacci;
import HeapStackQueue.CountClouds;
import HeapStackQueue.DecodeString;
import HeapStackQueue.MinOfStack;
import HeapStackQueue.NextLarger;
import Sorting.BubbleSort;
import Sorting.HigherVersion2;
import Sorting.SortByString;
import Tree.RestoreBinaryTree;
import Tree.HasPathWithGivenSum;
import Tree.Tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main {

    public static void main(String args[]){
        /*
        //Job Sequencing start
        Job[] jobs = new Job[5];
        jobs[0] = new Job('a', 2, 100);
        jobs[1] = new Job('b', 1, 19);
        jobs[2] = new Job('c', 2, 27);
        jobs[3] = new Job('d', 1, 25);
        jobs[4] = new Job('e', 3, 15);

        JobSequencing jobSequencing = new JobSequencing(jobs);
        jobSequencing.orderJob();
        jobSequencing.printJob();
        //Job Sequencing end
        */
        /*
        String[] crypt =  {"SEND",
                "MORE",
                "MONEY"};
        char[][] solution =  {{'O','0'},
                                {'M','1'},
                                {'Y','2'},
                                {'E','5'},
                                {'N','6'},
                                {'D','7'},
                                {'R','8'},
                                {'S','9'}};

        Array.IsCryptSolution cryptSolution = new Array.IsCryptSolution(crypt, solution);
        System.out.println("result: " + cryptSolution.isCryptSolution());
        */

        //System.out.println(FindProfession.findProfession(10, 470));
        /*int[] arr = {-4, 5, -3, 4};
        System.out.println(ArrayMaxConsecutiveSum.arrayMaxConsecutiveSum2(arr));*/

        /*String s = "4[b3[a]]5[c]10[d]";
        System.out.println(DecodeString.decodeString(s));*/

        /*int[] arr = {6, 7, 8, 3};
        for(int i : NextLarger.nextLarger(arr)){
            System.out.println(i);
        }*/

        /*String[] operations = {"push 10", "min", "push 5", "min", "push 8", "min", "pop", "min", "pop", "min"};
        for(int i : MinOfStack.minimumOnStack(operations))
            System.out.println(i);*/

        /*char[][] map = {{'0', '1', '0'},
                {'1', '0', '1'},
                {'0', '1', '0'}};
        System.out.println(CountClouds.countClouds(map));*/

        /*int[] inorder = {-93277, 62688, -4487, -100000, 43284, 64724, 70666, -63901,
                -4545, 31785, -30391, -90506, -67320, 31470, -50294, 100000, -77706,
                -47872, -700, 31330, -41014, 63472, 96532, -58604, 24487, -59632,
                40548, 88721, -49562, 81334, -74950, -43186, -32522, -67455, -62444,
                -92411, 39658, 64886, -7507, 72677, 23996, -32027, 1949, 96886,
                -50905, -53843, 73259, 3952, -9024, -45935, -58973, 44181, 33954,
                98823, -62198, -75945, -50456, -74832, 59867, 32485, -5388, -4243,
                -11714, 95991, -65256, 77375, -65578, 63596, -62994, -31825, 21185,
                -54250, -87849, -37091, 566, -51763, -59913, 86300, 83168, 41183,
                33902, 21453, -80805, -83960, 51207, 21642, -69592, 98211, 42214,
                75267, -43649, -83383, -48575, -39177, 32522, 31512, 35718, -32561,
                -91328, -35944, 31034, 48326, 33263, 48567, 23487, 57221, -84842,
                -90399, 36450, -43398, -8094, -82876, -10005, -59076, 80074, 52836,
                -31094, -32371, -88295, 69366, -28970, 18868, -96231, -43129, 25764,
                -23754, 68900, 67720, 62535, 83504, 86143, -97239, 33583, 27728,
                -86091, -62356, -90390, 88490, -83560, 60448, 69051, -63761, -75001,
                -41537, -25104, -80595, -25615, 75577, 77540, -67851, -72120, -9634,
                53521, 35022, -2659, 50482, -45803, -59717, -14069, -85588, -48357,
                -16259, 7541, 34220, 89071, -80129, -75168, 68854, -16152, -64570,
                -8315, -32092, -19972, -15785, 806, -78460, 71773, 1666, -55229, -50827,
                27169, 52880, -28918, -24353, -83284, -95660, -33685, -87048, -41700,
                18829, -66227, -9255, 84832, -98542, 99874, -12699, -40087, -38654, 12077,
                68113, -43474, 71684, -88475, 18760, 89834, 75888, 7906, 60326, -64824, -26653,
                -59541, -94381, 14264, -8741, 89843, -16306, 88993, 55658, 23816, 67967, 10061,
                -63184, -27388, -85358, -8763, -37551, -92036, 26694, 94968, -52470, 24583, 29246, -54151, -65728, -24924, 5832, 35922, -45760, 37533, 1350, -59576, 97139, -44604, 42185, 37504, 70582, -19785, 98703, 6304, -97508, 90221, -84661, 91266, 81903, 22999, 97682, -43248, 66143, -96784, -59152, 77813, -9493, 26003, 41804, -10787, 3408, -87295, -41861, -15281, -46548, -80731, -7860, 25207, 72815, 18494, -25294, 49877, 46213, 31456, 76308, 91410, -17341, 48388, -48002, 43779, 30292, -87508, 81030, 20160, 20042, -88589, -1436, -91811, 59973, 94688, -19398, -32441, 24137, 96726, 44197, 67244, -52936, 60906, -57188, 29508, -42795, -73589, -40019, 43501, 84203, -14745, 93164, -50111, 83932, 65643, -56716, 93420, 16606, 19146, 19485, -45188, 38304, -29741, -48055, 54268, -31529, -37987, -38706, 5632, 34450, 35403, 39862, 69549, -78511, 89740, -48633, -37426, 74644, -6246, -25266, 64835, 61256, 30159, -98429, -65269, 26111, 1825, -6385, -65699, -17893, 373, 27691, -16215, 9182, 51324, 66503, -78288, 4485, 22759, -80626, 86681, 32900, -85994, 64375, 75196, -51200, -82591, 58506, -11510, 31521, 17566, -99357, 48438, 80160, 81778, -8347, -20533, -50966, 29135, -24792, -21509, 49014, 92224, 46993, 16617, 43415, -16522, -1816, -48564, -54009, 58578, 98252, -22079, 14060, 32519, 66661, 63593, 58945, -62970, 5098, -69304, 69634, -93734, -2244, -26046, -47618, -59476, 38148, 12623, -65237, -90044, 91544, -294, 90528, 46595, 89661, -69281, 84746, 86294, 58501, 70861, -27744, 75524, 31664, -28165, -23371, 33670, 65553, -28200, -20974, -17411, 32270, 36345, 31631, -37710, -41622, 81662, -94586, -28554, -59472, 98312, 38866, -1784, 91201, -14748, 4106, 78224, -90047, 41026, -97789, -16504, -1665, -90058, -4848, 19598, -94133, -35857, -28353, 83606, 56003, -36549, 64089, -2908, 54350, 40583, 97573, 36409, 35796, -90653, -68926, 3645, -49651, 21732, 31874, 50292, 34734, -58745, -17410, 71457, -24234, 5930, -17706, -81782, 63956, -14686, -93831, -74580, 81528, 51888, 33014, 51498, 23804, 65491, -29697, -90126, 94096, -91964, -45588, -49998, -82814, 47349, -73197, -28502, -9425, -65454, -25188, 98345, -10955, 4345, -61816, 23740, 84850, -72348, -23771, 79384, 91214, 34074, 20413, 56874, 82033, 15818, -38746, 48730, 68894, 83758, 55630, 46302, 28344, -6691, -20056, -22839, 90973, 64444, 31161, 26181, -14074, 71433, 80972, -22569, 56752, 57357, -83397, -29228, -85896, 79974, 34486, -26716, -83782, -62280, 31920, -16939, 44866, -29959, -7547, -60667, 50209, -50209, -34770, -15101, -13257, 74958, -37028, 93870, 78205, -8392, 16713, -51870, -9587, -13316, -92063, -46232, 65489, 83917, -24187, -61650, -45352, 29026, 91003, 95989, 75878, -64085, -96322, 59548, 23006, -79584, 37347, -27344, -49931, -38511, 62785, -71611, -32846, -43216, -17115, -72773, -98217, 32107, -44570, 30230, -65648, 73681, -25656, -39425, 78685, -13977, -94867, 52504, 12155, 19612, 43194, 46511, -13045, -58323, 17971, -73106, -93376, -53174, -88378, -19894, 18727, 79288, 50915, -24515, -20962, 93001, -71531, -8677, 43867, 77545, -59669, 7963, 62080, -59180, -86744, 90476, 72258, -38108, -42342, -91335, 1699, 722, 98367, -7796, -36337, 64118, 26525, -10097, -8873, -91597, -86988, 11842, 4416, -32673, -80041, -35712, -8038, -38539, 6834, 37853, 17606, -30245, 63135, -6225, 35936, -76165, 68043, 26800, 55247, -81238, -54247, 62255, 38936, 18901, -18041, 60741, -81142, -12754, 91773, 95719, -87896, -30303, -71108, -92234, 10036, -48904, -25585, 1092, 15651, -33065, -78517, 35710, -64902, 22035, 14385, 68206, 19858, -91596, -72661, 24865, 26522, 95868, 64459, 11910, -4859, -96790, -18283, -18462, -78371, -27729, 12639, -61282, 85543, -40271, 67196, 99769, 2296, 55268, 1315, 12464, -64226, 21917, 61502, -98535, -40519, -44477, 8485, 62226, 72512, 75825, -82453, 72648, -46142, 8201, 95470, 85237, 98294, 73925, -67658, -99692, -56846, -98646, -23967, -94925, -76176, 88364, -21324, -91471, 22372, -92968, 83388, -23733, -11983, 51580, -69023, 19881, -45365, -47977, 67309, -45685, -69931, 55401, 52846, -24542, 95714, 26602, -38133, 15047, -71544, -10758, 1182, -15933, 80745, 36275, -34580, -99892, -82512, 69007, -95139, -47958, 54094, -82703, 80881, 14666, 20673, 71544, -70086, 37687, 8373, 20310, 29732, -55009, -52710, -63936, -40537, 72845, 46018, 35364, -81652, -76139, -37018, -48409, -73362, 45977, -41371, 39444, -88637, -7499, 96124, -64645, 67981, -46794, -85674, 78341, -68630, -32428, -82617, -48813, -55139, 75932, -80135, 60931, -12665, 79540, -82067, -20820, -51549, 70660, 5793, 97281, 26718, 15441, -29675, 37174, -76951, 75369, 68834, 71148, 82713, 46666, -45765, -56429, 1447, 98762, -81860, -20827, -16894, 50123, 14485, 95597, -55008, -77902, 95465, -83264, -70823, -16389, -46150, 2390, -85584, 78122, 49230, 39515, -82466, -60248, -98871, -94339, -65302, 4288, 37703, -69735, -56088, -30211, -26891, -95053, -9468, -23192, 34951, 34386, 61017, -26290, 30826, -61782, -4960, -19261, 9546, 77768, 70245, 46711, 17576, -146, -97213, 56535, -11991, -44659, -19496, 31651, -96276, 94691, -4598, 94332, 63775, 75034, 78563, 53052, -40656, -50243, 97620, 10434, 57500, 51813, 62163, 94322, 5120, 46283, -63000, -63640, 46686, 25534, -83837, -86561, 98634, 5068, 56968, -14694, -18121, 28263, -81100, 14814, 22384, 11215, -97552, 45334, -92151, -25420, -62479, -9983, -23904, -34270, -33703, -3155, 85028, -60164, 24262, -82291, 91732, -4546, -85774, -3629, -89680, -78313, 98282, -26596, 48810, -9095, -87304, -9736, 46561, -30897, -79753, -51680, -64054, 70273, 64563, 85408, 88624, 98188, 791, 98609, 50096, 82385, -65597, 84382, -22844, 33417, -21361, -63653, -92043, -75209, -53231, 81635, -48184, 15355, -42525, -22476, 30116, -94062, 90270, 82072, 6127, -2400, -30942, -43675, -99896, 31122, 53013, 54446, 49084, 91524, 17075, -19482, 27678, 16964, -91357, 64763, 40799, -58697, 21458, -17333, 4950, 73838, 20341, 63705, 83445, -199, -72106, 17630, 91593, -17238, -85841, -12807, -17785, 60267, -16580, -23469, -42898, -24687, 65058, -73609, -8807, 16694, -3439, 94898, -41275, -26527, -35003, -49986, 84458, -20531, -29773, 42403, 90488, -39787, -84171, 54142, -81092, -91350, 50606, 24170, 87218, 57485, -49719, -75325, -69760, 55959, 63526, 77081, 22433, 52103, 78263, -63267, 17707, 12347, 98, 75363, 2026, 8866, 90993, 4198, -35835, 73164, -17086, 24549, 59136, -31391, -15578, -97339, -14653, -74571, -33468, 21349, -76180, -64859, -3040, -15152, 47083, 70588, -77289, 22440, 7628, 87466, 89528, -60672, -48744, 15770, 73387, -29237, 26143, 96256, 68166, -22863, 11102, 88076, 20170, 39285, -14945, -72201, -94605, 86211, 4282, 59918, -35847, 69060, -39647, 56714, 49820, -59293, -75989, 89872, -25220, 68337, -77074, 11916, -83064, 30176, 80772, -89542, 68056, 29926, -86329, -34995, -64405, 99512, 8597, 4142, 85488, -61841, 45632, -53026, -93603, 83678, -95266, 86981, -64143, 17753, -16488, 32530, 42121, -32139, -32935, 70752, -65686, 48579, 3570, 6838, 80027, -94027, 54981, 39351, 33019, 406, 80956, -60179, -89356, 57947, 88030, -98067, 78763, -26320, -60965, 20590, 75673, -55934, -68508, -79451, 62277, -59792, 33181, 85286, -10320, 93264, -17032, 43683, -73460, -94304, -31793, 3778, 5473, 81550, -13146, -54974, 55714, 70490, -52566, 72384, -10862, -36753, 57109, 47102, 20807, 86524, 32655, -65065, -67790, 34945, -6946, 56851, -98459, -58035, -26024, 61430, 34969, 41566, 71623, 540, -81389, -37565, -44168, -83329, 9723, 45743, -28740, 40319, -33679, 40217, 93525, 16099, -59025, 24744, -83344, -79737, 49075, -84587, -12442, -67465, -36351, -7939, -54768, 42118, -37646, 82762, 14233, -29547, -88152, 31796, 91819, 80224, 23694, -47780, -65552, -44627, -32458, -34726, 87974, 42288, -86446, -22960, 95744, 77362, 56340, 47880, 50737, -40805, -191, 14010, 14757, -52591, 76664, 42338, -14161, -82033, -61265, -18816, -35968, 86676, 64991, 3221, 73823, 91047, -941, -63713, -28106, -53807, 41552, 5521, 54108, 22215, 95873, -52187, -936, -64585, 14860, 3337, -14358, 44995, 66133, 14932, 46229, -21054, 26009, -58166, -17035, 87664, -85643, -5231, 17047, 1479, 44648, -23532, -44546, 86492, -66593, 61919, -9139, -35802, 95226, 37879, 22873, 72096, 73744, -51119, -81736, -48645, -67746, 80583, -51922, 30259, -69976, -23017, -15156, -1923, -26495, -12934, -51238, -706, 96075, -68364, 755, -60202, 70745, -12851, 95601, -86799, 55086, -89140, -91243, 50778, -88457, 69146, -48949, 72283, 87717, -8748, -97203, 15934, 71031, 26905, -20991, 183, 2895, 26502, 86893, -27668, 21817, 45080, -18287, 33294, -40407, -8749, 23048, 42384, 30092, -93447, -717, -20723, 12899, -42609, -28888, -54200, -73535, 7844, -5782, 70088, -12747, 2434, 61453, 6888, -2030, -47428, -79254, 55289, -95520, 32167, -48457, 79445, 53143, 64560, -17323, 66517, -96047, 89053, 30492, 30577, 11193, 43207, 69830, -17496, 5010, 54861, 62763, 48637, 18996, 97230, -4139, -3505, 12817, -63704, -57635, -28021, -11919, -87634, -35359, 31900, -31183, -64384, -49435, 72318, -98361, 34804, -62712, -36565, -22700, 83212, -64008, 46734, -24649, 57344, -41805, -58015, 34055, 16566, 43959, 15090, 9833, 82379, -88047, -16759, -33186, 99180, 56604, -82695, -56765, -78711, -56616, -23151, -20766, 2372, -30087, 18204, 36151, -74855, 54992, 4068, -13051, -90541, 31594, -7329, 91609, 61673, 71103, 91608, 96511, -78626, -29040, -59954, 4290, -94238, -96876, -98955, 21838, 63674, -14779, 42665, 14038, 59937, 51674, 26608, 82770, 95139, 96384, 87716, -59398, 65047, -83819, 23352, -89213, 65094, 15976, 89323, -10101, -14825, 54180, 51994, 1683, -84420, 74357, -4317, 85923, 27888, -79163, -66298, 18618, 11266, 90223, -78792, 87599, -61802, -69644, 54603, 82235, 48582, -2160, -40258, 37761, -44078, -43062, 74694, 91501, 94791, -98909, -77801, -90515, -25333, 76647, 43052, -17152, -53241, 86062, -9906, 93293, 50414, -91585, 86677, 65425, 2758, -61188, -48506, 88850, 47826, -33316, 10452, 36246, 76742, 50260, -36057, 85716, -221, -54509, -73979, 39523, -43306, -12297, 48038, 52041, 58218, -30394, 18248, -66673, -30500, -39991, -80000, -51132, 25414, 35909, 17974, -80819, 47212, 83814, -27241, -49507, -10818, -90382, -58967, 77240, -15516, -94371, 35756, -52172, -15116, -72512, -46270, 59067, 63491, 14829, 56246, 44579, 5065, -26740, 65958, 24836, -77456, -71702, 46884, 69108, 61859, -84602, -14105, -29916, -70944, -80558, -58616, -53322, -97543, -71552, -50735, 38037, -98852, -23104, 30655, -31328, -26707, 64532, 46879, -61349, 11661, 4969, -38668, 46692, -56702, 48175, 18554, -5915, 26728, -17899, 88896, -26451, 75154, 23656, -40188, 85131, -66599, -44572, 89201, -19991, 74719, -90042, 97289, -86105, -95862, -89718, 86074, -56370, -64983, 98606, 10758, 85635, -52147, -30289, 88381, 79323, 65044, -3283, 32520, 9274, -70139, 24029, 37787, -68303, 95179, 72673, -36983, 82383, 46070, -66287, 59450, 25461, -12729, 2509, 60572, -54323, 24507, 52471, -65681, 89439, -31313, 54553, -35116, -36188, -51737, 7758, -52226, 10276, 93854, -72967, -13816, 57252, -38682, 7795, 14395, 82837, 78664, -85904, -38502, -5376, -38378, -96479, -88966, -80185, 28556, -44291, -35158, -47945, -87074, 54271, 76071, 9929, 84138, 31743, -54436, -76347, 41196, -6226, -71789, 7817, 19018, -64256, 94244, 39174, -41678, -13949, 18542, -79379, -49667, 6209, -36662, 74912, -41030, 46136, 37216, -29173, 17427, 95892, -85975, 17993, -25533, 78700, -63237, -43714, 54907, -64131, -89892, -10057, -74563, 97147, 74099, 83572, -56314, 27143, -97358, -26482, -62052, -59326, -54694, 44005, 40424, 63979, -24704, -16289, 65068, -17078, 74740, -38734, 59393, 92193, 9544, -24400, -59173, -53874, 86905, 31333, 5545, 16452, 76631, -6841, -73657, -10071, -89757, 33008, 42534, -75024, 3936, -81188, 88298, -54581, 13388, 78172, -80478, -95504, -4169, -98264, -66202, -51133, -87001, -44540, 3916, -1869, -58652, 34550, -18166, -57107, 51230, 89035, -51412, -57743, 25685, 52777, -71621, -83304, 1375, 44254, -19781, 35933, -15384, 4423, 74972, -35530, 72586, -84496, 37791, 15113, -89622, -29534, 36348, -32794, 2349, 37256, -12135, 43775, 75041, 4034, -79120, 2578, -49074, -79786, 66925, -57787, -17609, -56052, -6944, 16690, 66425, -49485, 94978, -67401, 85806, 44187, 33018, 95164, 77851, -46092, -77865, -38943, -79489, 35144, -29507, -49533, 79551, -97422, -59467, -2031, -99932, -5692, -70676, 26300, -27628, -88375, -85943, 31257, 28494, 57757, -5520, 18730, -36032, -32809, 23531, -20267, -31322, 10336, -17783, 74186, -50351, -43444, -55779, 34379, -95986, 17984, 84135, -75913, -76624, -95174, 90363, -24745, -67393, -28317, 55722, 63473, 73367, -52793, -46178, -33669, -39348, 76585, -12575, -53776, -6758, 56872, 82660, -46188, 48737, 34733, 30643, -50362, -55160, 70996, -65416, -10099, 17417, -28473, 39193, -66243, -87607, 59267, 94225, -77911, -37291, -79189, -62765, -38212, 89442,
                4574, 93052, -901, -78670, 84821, 30745, 20575, 28837, -174, -9914, -83631, 40897, 3264, 84715, -76657, 49613, -22746, -68193, -98353, 1056, 76749, 74625, -46562, -85903, 69400, 21833, -7393, 57729, 37140, 45788, 17393, -55084, -14403, -62484, 7512, -68346, 26045, 14744, 35306, 50152, -15932, 17749, 3810, 69918, 81047, 18224, 63442, -32480, -95263, 60597, -65937, 95257, -30112, 2058, 35701, -84422};
        int[] preorder = {35701, 49084, -25188, 91266, 68900, 95991, -43186, 100000, -63901, -100000, 62688, -93277, -4487, 64724, 43284, 70666, -90506, 31785, -4545, -30391, 31470, -67320, -50294, -58604, 31330, -47872, -77706, -700, 63472, -41014, 96532, 88721, -59632, 24487, 40548, 81334, -49562, -74950, 3952, 72677, -92411, -67455, -32522, -62444, 64886, 39658, -7507, 96886, -32027, 23996, 1949, -53843, -50905, 73259, -75945, 44181, -45935, -9024, -58973, 98823, 33954, -62198, 32485, -74832, -50456, 59867, -4243, -5388, -11714, 31512, 41183, -54250, 63596, 77375, -65256, -65578, -31825, -62994, 21185, -51763, -37091, -87849, 566, 86300, -59913, 83168, 98211, -83960, 21453, 33902, -80805, 21642, 51207, -69592, -83383, 75267, 42214, -43649, -39177, -48575, 32522, -8094, 48567, -35944, -32561, 35718, -91328, 48326, 31034, 33263, -90399, 57221, 23487, -84842, 36450, -43398, -88295, 80074, -10005, -82876, -59076, -31094, 52836, -32371, -96231, -28970, 69366, 18868, 25764, -43129, -23754, 18829, -14069, -75001, -86091, 86143, 62535, 67720, 83504, 33583, -97239, 27728, -83560, -90390, -62356, 88490, 69051, 60448, -63761, -72120, -25615, -25104, -41537, -80595, 77540, 75577, -67851, -2659, 53521, -9634, 35022, -45803, 50482, -59717, 806, -75168, 7541, -48357, -85588, -16259, 89071, 34220, -80129, -8315, -16152, 68854, -64570, -19972, -32092, -15785, -28918, -55229, 71773, -78460, 1666, 27169, -50827, 52880, -95660, -24353, -83284, -87048, -33685, -41700, 10061, 89834, -38654, -98542, -9255, -66227, 84832, -12699, 99874, -40087, 71684, 68113, 12077, -43474, -88475, 18760, 14264, -64824, 7906, 75888, 60326, -59541, -26653, -94381, 88993, 89843, -8741, -16306, 23816, 55658, 67967, 35922, 94968, -8763, -27388, -63184, -85358, -92036, -37551, 26694, -54151, 24583, -52470, 29246, -24924, -65728, 5832, 37504, -59576, 37533, -45760, 1350, -44604, 97139, 42185, 6304, -19785, 70582, 98703, 90221, -97508, -84661, -21509, 93420, 43779, -15281, 77813, -43248, 22999, 81903, 97682, -96784, 66143, -59152, -10787, 26003, -9493, 41804, -87295, 3408, -41861, 49877, 25207, -80731, -46548, -7860, 18494, 72815, -25294, 91410, 31456, 46213, 76308, 48388, -17341, -48002, 67244, -91811, 20160, -87508, 30292, 81030, -88589, 20042, -1436, -32441, 94688, 59973, -19398, 96726, 24137, 44197, 43501, 29508, 60906, -52936, -57188, -73589, -42795, -40019, -50111, -14745, 84203, 93164, 65643, 83932, -56716, -65699, 69549, 54268, -45188, 19146, 16606, 19485, -29741, 38304, -48055, 5632, -37987, -31529, -38706, 35403, 34450, 39862, 64835, -37426, 89740, -78511, -48633, -6246, 74644, -25266, -65269, 30159, 61256, -98429, 1825, 26111, -6385, 75196, -78288, -16215, 373, -17893, 27691, 51324, 9182, 66503, 86681, 22759, 4485, -80626, -85994, 32900, 64375, 48438, -11510, -82591, -51200, 58506, 17566, 31521, -99357, -20533, 81778, 80160, -8347, 29135, -50966, -24792, -14748, -294, 63593, -48564, 16617, 92224, 49014, 46993, -16522, 43415, -1816, -22079, 58578, -54009, 98252, 32519, 14060, 66661, -26046, -69304, -62970, 58945, 5098, -93734, 69634, -2244, 12623, -59476, -47618, 38148, -90044, -65237, 91544, -28200, 70861, -69281, 46595, 90528, 89661, 86294, 84746, 58501, -28165, 75524, -27744, 31664, 33670, -23371, 65553, 81662, 36345, -17411, -20974, 32270, -37710, 31631, -41622, 98312, -28554, -94586, -59472, -1784, 38866, 91201, 31874, -28353, -90058, 41026, 78224, 4106, -90047, -16504, -97789, -1665, -35857, 19598, -4848, -94133, 97573, 64089, 56003, 83606, -36549, 54350, -2908, 40583, -68926, 35796, 36409, -90653, -49651, 3645, 21732, 33014, -17706, -17410, 34734, 50292, -58745, -24234, 71457, 5930, -93831, 63956, -81782, -14686, 81528, -74580, 51888, -45588, -29697, 23804, 51498, 65491, 94096, -90126, -91964, -73197, -82814, -49998, 47349, -9425, -28502, -65454, -98646, -19894, -60667, 48730, -38746, -23771, -61816, -10955, 98345, 4345, 84850, 23740, -72348, 20413, 91214, 79384, 34074, 82033, 56874, 15818, -22569, -22839, 46302, 83758, 68894, 55630, -6691, 28344, -20056, 26181, 64444, 90973, 31161, 71433, -14074, 80972, -26716, -29228, 57357, 56752, -83397, 79974, -85896, 34486, -16939, -62280, -83782, 31920, -29959, 44866, -7547, -27344, -46232, 93870, -15101, -50209, 50209, -34770, 74958, -13257, -37028, -51870, -8392, 78205, 16713, -13316, -9587, -92063, 95989, -61650, 83917, 65489, -24187, 29026, -45352, 91003, 59548, -64085, 75878, -96322, -79584, 23006, 37347, -39425, -72773, -71611, -38511, -49931, 62785, -43216, -32846, -17115, 30230, 32107, -98217, -44570, 73681, -65648, -25656, 46511, 52504, -13977, 78685, -94867, 19612, 12155, 43194, -73106, -58323, -13045, 17971, -53174, -93376, -88378, -87896, -8873, 90476, -8677, -24515, 79288, 18727, 50915, 93001, -20962, -71531, 7963, 77545, 43867, -59669, -59180, 62080, -86744, -7796, -91335, -38108, 72258, -42342, 722, 1699, 98367, -10097, 64118, -36337, 26525, 35936, -8038, 4416, -86988, -91597, 11842, -80041, -32673, -35712, 17606, 6834, -38539, 37853, 63135, -30245, -6225, 38936, 55247, 68043, -76165, 26800, -54247, -81238, 62255, -81142, -18041, 18901, 60741, 91773, -12754, 95719, 85543, 19858, 15651, 10036, -71108, -30303, -92234, -25585, -48904, 1092, -64902, -78517, -33065, 35710, 14385, 22035, 68206, -4859, 26522, -72661, -91596, 24865, 64459, 95868, 11910, -78371, -18283, -96790, -18462, 12639, -27729, -61282, -44477, 55268, 2296, 67196, -40271, 99769, 21917, 12464, 1315, -64226, -98535, 61502, -40519, 8201, 75825, 62226, 8485, 72512, 72648, -82453, -46142, 73925, 85237, 95470, 98294, -99692, -67658, -56846, -69735, 39444, 36275, -47977, -92968, 88364, -94925, -23967, -76176, -91471, -21324, 22372, 51580, -23733, 83388, -11983, 19881, -69023, -45365, 26602, 55401, -45685, 67309, -69931, -24542, 52846, 95714, -10758, 15047, -38133, -71544, -15933, 1182, 80745, 20310, -82703, 69007, -99892, -34580, -82512, -47958, -95139, 54094, 71544, 14666, 80881, 20673, 37687, -70086, 8373, 35364, -63936, -55009, 29732, -52710, 72845, -40537, 46018, -48409, -76139, -81652, -37018, 45977, -73362, -41371, 71148, 60931, 78341, -64645, -7499, -88637, 96124, -46794, 67981, -85674, -48813, -32428, -68630, -82617, 75932, -55139, -80135, 97281, -20820, 79540, -12665, -82067, 70660, -51549, 5793, 37174, 15441, 26718, -29675, 75369, -76951, 68834, -83264, -20827, -56429, 46666, 82713, -45765, 98762, 1447, -81860, 95597, 50123, -16894, 14485, -77902, -55008, 95465, 39515, 2390, -16389, -70823, -46150, 78122, -85584, 49230, -94339, -60248, -82466, -98871, 4288, -65302, 37703, -25420, 75034, 77768, 34386, -95053, -30211, -56088, -26891, -23192, -9468, 34951, -61782, -26290, 61017, 30826, -19261, -4960, 9546, -44659, -146, 46711, 70245, 17576, 56535, -97213, -11991, 94691, 31651, -19496, -96276, 94332, -4598, 63775, 25534, 51813, -50243, 53052, 78563, -40656, 10434, 97620, 57500, 46283, 94322, 62163, 5120, -63640, -63000, 46686, 28263, 5068, -86561, -83837, 98634, -14694, 56968, -18121, 11215, 14814, -81100, 22384, 45334, -97552, -92151, 88624, -78313, -60164, -34270, -9983, -62479, -23904, -3155, -33703, 85028, -4546, -82291, 24262, 91732, -3629, -85774, -89680, 46561, 48810, -26596, 98282, -87304, -9095, -9736, -64054, -79753, -30897, -51680, 64563, 70273, 85408, -48184, -22844, 50096, 791, 98188, 98609, -65597, 82385, 84382, -92043, -21361, 33417, -63653, -53231, -75209, 81635, 6127, 30116, -42525, 15355, -22476, 90270, -94062, 82072, -99896, -30942, -2400, -43675, 53013, 31122, 54446, 51994, 80224, 89872, 17707, -8807, 83445, 40799, 27678, 17075, 91524, -19482, -91357, 16964, 64763, 4950, 21458, -58697, -17333, 20341, 73838, 63705, -17785, 91593, -72106, -199, 17630, -85841, -17238, -12807, -42898, -16580, 60267, -23469, 65058, -24687, -73609, -81092, 84458, -41275, -3439, 16694, 94898, -35003, -26527, -49986, 90488, -29773, -20531, 42403, -84171, -39787, 54142, -69760, 87218, 50606, -91350, 24170, -49719, 57485, -75325, 22433, 63526, 55959, 77081, 78263, 52103, -63267, -48744, -14653, -35835, 2026, 98, 12347, 75363, 90993, 8866, 4198, 59136, -17086, 73164, 24549, -15578, -31391, -97339, 47083, -76180, -33468, -74571, 21349, -3040, -64859, -15152, 7628, -77289, 70588, 22440, 89528, 87466, -60672, 4282, 11102, 26143, 73387, 15770, -29237, 68166, 96256, -22863, -14945, 20170, 88076, 39285, -94605, -72201, 86211, -75989, -39647, -35847, 59918, 69060, 49820, 56714, -59293, 43683, 70752, 4142, -89542, 11916, 68337, -25220, -77074, 30176, -83064, 80772, -34995, 29926, 68056, -86329, 99512, -64405, 8597, 86981, -53026, -61841, 85488, 45632, 83678, -93603, -95266, 32530, 17753, -64143, -16488, -32139, 42121, -32935, -98067, 39351, 6838, 48579, -65686, 3570, -94027, 80027, 54981, -60179, 406, 33019, 80956, 57947, -89356, 88030, -79451, 20590, -26320, 78763, -60965, -55934, 75673, -68508, 85286, -59792, 62277, 33181, 93264, -10320, -17032, 540, 47102, -54974, 3778, -94304, -73460, -31793, 81550, 5473, -13146, 72384, 70490, 55714, -52566, -36753, -10862, 57109, 56851, -65065, 86524, 20807, 32655, 34945, -67790, -6946, 61430, -58035, -98459, -26024, 41566, 34969, 71623, -79737, 40319, -83329, -37565, -81389, -44168, 45743, 9723, -28740, 16099, 40217, -33679, 93525, 24744, -59025, -83344, 42118, -67465, -84587, 49075, -12442, -7939, -36351, -54768, -29547, 82762, -37646, 14233, 31796, -88152, 91819, -20723, 86492, 91047, -40805, 42288, -44627, -47780, 23694, -65552, -34726, -32458, 87974, 77362, -22960, -86446, 95744, 47880, 56340, 50737, -82033, -52591, 14010, -191, 14757, 42338, 76664, -14161, 86676, -18816, -61265, -35968, 3221, 64991, 73823, 44995, 22215, -53807, -63713, -941, -28106, 5521, 41552, 54108, -64585, -52187, 95873, -936, 3337, 14860, -14358, 87664, -21054, 14932, 66133, 46229, -58166, 26009, -17035, 1479, -5231, -85643, 17047, -23532, 44648, -44546, -86799, 30259, 72096, -35802, 61919, -66593, -9139, 37879, 95226, 22873, -48645, -51119, 73744, -81736, 80583, -67746, -51922, -706, -1923, -23017, -69976, -15156, -12934, -26495, -51238, -60202, -68364, 96075, 755, -12851, 70745, 95601, 183, 72283, 50778, -89140, 55086, -91243, 69146, -88457, -48949, 15934, -8748, 87717, -97203, 26905, 71031, -20991, 33294, -27668, 26502, 2895, 86893, 45080, 21817, -18287, 42384, -8749, -40407, 23048, -93447, 30092, -717, -58015, -17496, 55289, 70088, -54200, -42609, 12899, -28888, 7844, -73535, -5782, 6888, 2434, -12747, 61453, -47428, -2030, -79254, 66517, 79445, 32167, -95520, -48457, 64560, 53143, -17323, 30577, 89053, -96047, 30492, 43207, 11193, 69830, 31900, -3505, 48637, 54861, 5010, 62763, 97230, 18996, -4139, -28021, -63704, 12817, -57635, -87634, -11919, -35359, -36565, 72318, -64384, -31183, -49435, 34804, -98361, -62712, 46734, 83212, -22700, -64008, 57344, -24649, -41805, 91608, -23151, -16759, 15090, 16566, 34055, 43959, 82379, 9833, -88047, -82695, 99180, -33186, 56604, -78711, -56765, -56616, 4068, 18204, 2372, -20766, -30087, -74855, 36151, 54992, -7329, -90541, -13051, 31594, 61673, 91609, 71103, 26608, -98955, -59954, -78626, 96511, -29040, -94238, 4290, -96876, 42665, 63674, 21838, -14779, 59937, 14038, 51674, 23352, 87716, 95139, 82770, 96384, 65047, -59398, -83819, 89323, 65094, -89213, 15976, -14825, -10101, 54180, 74099, 46692, 52041, -90515, 54603, -66298, -4317, -84420, 1683, 74357, 27888, 85923, -79163, -78792, 11266, 18618, 90223, -61802, 87599, -69644, 37761, 82235, -2160, 48582, -40258, 91501, -43062, -44078, 74694, -98909, 94791, -77801, 88850, 93293, -17152, 76647, -25333, 43052, 86062, -53241, -9906, 65425, -91585, 50414, 86677, -61188, 2758, -48506, 85716, 36246, -33316, 47826, 10452, 50260, 76742, -36057, 39523, -54509, -221, -73979, -12297, -43306, 48038, 44579, -49507, -51132, -66673, -30394, 58218, 18248, -39991, -30500, -80000, -80819, 35909, 25414, 17974, 83814, 47212, -27241, -52172, 77240, -90382, -10818, -58967, -94371, -15516, 35756, 59067, -72512, -15116, -46270, 14829, 63491, 56246, -53322, 69108, 24836, -26740, 5065, 65958, -71702, -77456, 46884, -29916, -84602, 61859, -14105, -80558, -70944, -58616, -31328, 38037, -71552, -97543, -50735, -23104, -98852, 30655, -61349, 64532, -26707, 46879, 4969, 11661, -38668, 10276, 79323, -19991, -26451, -5915, 48175, -56702, 18554, -17899, 26728, 88896, 85131, 23656, 75154, -40188, -44572, -66599, 89201, -56370, -86105, -90042, 74719, 97289, -89718, -95862, 86074, 85635, 98606, -64983, 10758, -30289, -52147, 88381, 25461, -68303, 9274, -3283, 65044, 32520, 24029, -70139, 37787, 82383, 72673, 95179, -36983, -66287, 46070, 59450, 89439, -54323, 2509, -12729, 60572, 52471, 24507, -65681, -36188, 54553, -31313, -35116, 7758, -51737, -52226, -71789, -88966, 14395, -13816, -72967, 93854, -38682, 57252, 7795, -38502, 78664, 82837, -85904, -38378, -5376, -96479, 76071, -35158, 28556, -80185, -44291, -87074, -47945, 54271, -54436, 84138, 9929, 31743, 41196, -76347, -6226, 37216, 18542, 94244, 19018, 7817, -64256, -41678, 39174, -13949, -36662, -49667, -79379, 6209, -41030, 74912, 46136, -63237, -85975, 17427, -29173, 95892, -25533, 17993, 78700, -89892, 54907, -43714, -64131, -74563, -10057, 97147, -36032, 1375, -89757, 74740, -54694, -97358, -56314, 83572, 27143, -62052, -26482, -59326, -24704, 40424, 44005, 63979, 65068, -16289, -17078, 86905, 9544, 59393, -38734, 92193, -59173, -24400, -53874, 76631, 5545, 31333, 16452, -73657, -6841, -10071, -87001, 13388, 3936, 42534, 33008, -75024, 88298, -81188, -54581, -4169, -80478, 78172, -95504, -66202, -98264, -51133, 51230, -58652, 3916, -44540, -1869, -18166, 34550, -57107, 25685, -51412, 89035, -57743, -71621, 52777, -83304, 66425, 2349, 72586, -15384, -19781, 44254, 35933, 74972, 4423, -35530, -89622, 37791, -84496, 15113, 36348, -29534, -32794, -49074, 75041, -12135, 37256, 43775, -79120, 4034, 2578, -17609, 66925, -79786, -57787, -6944, -56052, 16690, 79551, 77851, 85806, 94978, -49485, -67401, 33018, 44187, 95164, -79489, -77865, -46092, -38943, -29507, 35144, -49533, -27628, -99932, -59467, -97422, -2031, -70676, -5692, 26300, 28494, -85943, -88375, 31257, -5520, 57757, 18730, 28837, -6758, -76624, -50351, -31322, 23531, -32809, -20267, -17783, 10336, 74186, -95986, -55779, -43444, 34379, 84135, 17984, -75913, 73367, -67393, 90363, -95174, -24745, 55722, -28317, 63473, -39348, -46178, -52793, -33669, -12575, 76585, -53776, -87607, -55160, 48737, 82660, 56872, -46188, 30643, 34733, -50362, 17417, -65416, 70996, -10099, 39193, -28473, -66243, 89442, -37291, 94225, 59267, -77911, -62765, -79189, -38212, -78670, 93052, 4574, -901, 30745, 84821, 20575, 26045, -85903, 49613, 40897, -9914, -174, -83631, 84715, 3264, -76657, 1056, -68193, -22746, -98353, 74625, 76749, -46562, -55084, 57729, 21833, 69400, -7393, 45788, 37140, 17393, -68346, -62484, -14403, 7512, -30112, 81047, -15932, 35306, 14744, 50152, 3810, 17749, 69918, -95263, 63442, 18224, -32480, -65937, 60597, 95257, 2058, -84422};

        int[] inorder3 = {4, 2, 1, 5, 3, 6};
        int[] preorder3 = {1, 2, 4, 3, 5, 6};
        int[] inorder1 = {1, 3, 2, 4};
        int[] preorder1 = {1, 2, 3, 4};
        int[] inorder2 = {3, 2, 4, 1};
        int[] preorder2 = {1, 2, 3, 4};
        Tree t = RestoreBinaryTree.restoreBinaryTree(inorder2, preorder2);
        System.out.println("");*/

        /*int[] a = {5, 4, 1, 2};
        BubbleSort.bubbleSort(a);*/
        //System.out.println(HigherVersion2.higherVersion2("1.0.5", "1.00.6"));
        /*System.out.println(SortByString.sortByString("weather", "therapyw"));*/

        //System.out.println(KBonacci.kbonacci(8, 100000));

        /*String s1 = "zzzz";
        String s2 = "zzzzzzz";
        System.out.println(CommonCharacterCount.commonCharacterCount(s1, s2));*/

        /*String s = "\"00:01:07,400-234-090\n" +
                "   00:05:01,701-080-080\n" +
                "   00:05:00,400-234-090\"";
        PhoneBill.solution(s);*/

        /*System.out.print(Taks2.solution(20));*/
        /*int n = 123321;
        System.out.println(IsLucky.isLucky(n));*/

        /*int[] a = {-1, 150, 190, 170, -1, -1, 160, 180};
        SortByHeight.sortByHeight(a);*/

        String s = "a(bc)de";
        ReverseParenthese.reverseParentheses(s);

        /*int[] array = {1, 2, 3, 4, 5, 6};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < array.length; i++){
            list.add(array[i]);
        }
        float average = 0;

        for(Iterator<Integer> it = list.iterator(); it.hasNext();){
            average = (average + it.next());
        }
        average /= 10;
        System.out.println(average);*/
    }


}
