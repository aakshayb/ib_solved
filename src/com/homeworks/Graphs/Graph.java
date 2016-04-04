package com.homeworks.Graphs;


import com.homeworks.Trees.TreeNode;

import java.util.*;
import java.util.LinkedList;

/**
 * Created by Akshay on 2/17/2016.
 */
public class Graph
{
  HashMap<Vertex, List<Edge>> weightedGraph = new HashMap<>();
  public static void main(String[] args)
  {
    Graph graph = new Graph();
    graph.buildGraph();
    graph.shortestPath(Vertex.create("DELHI"));
    ArrayList<Integer> array = new ArrayList<>();
    array.add(1);array.add(2);
    List<Integer> another = array.subList(2,2);
    List<Integer> array2 = new ArrayList<>(Arrays.asList(2,2, 3,4,5,6,2));
    array2.add(0,4);

    int newSize = graph.removeElement(array2 ,2);
    List<Integer> test = Arrays.asList(1, 2, 3, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 99, 100, 101, 102, 103, 104, 106, 107, 108, 109, 110, 111, 112, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124, 125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 144, 145, 146, 147, 148, 149, 150, 151, 152, 153, 155, 156, 157, 159, 160, 161, 162, 163, 164, 165, 166, 167, 168, 169, 170, 171, 172, 173, 174, 175, 176, 177, 178, 179, 180, 181, 182, 183, 184, 185, 186, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 250, 251, 252, 253, 254, 255, 256, 257, 258, 259, 260, 261, 262, 263, 264, 265, 266, 267, 268, 269, 270, 271, 272, 273, 274, 275, 276, 277, 278, 279, 280, 281, 282, 283, 284, 285, 286, 287, 288, 289, 291, 292, 293, 294, 295, 296, 297, 298, 299, 300, 301, 302, 303, 304, 305, 306, 307, 308, 309, 310, 311, 312, 313, 314, 315, 316, 317, 318, 319, 320, 321, 322, 323, 324, 325, 326, 327, 328, 329, 330, 331, 332, 333, 334, 335, 336, 337, 338, 339, 340, 341, 342, 343, 344, 345, 346, 347, 348, 349, 350, 351, 352, 353, 354, 355, 356, 357, 359, 360, 361, 362, 363, 364, 365, 366, 367, 368, 369, 370, 371, 372, 373, 374, 375, 376, 377, 378, 379, 380, 381, 382, 383, 384, 385, 386, 387, 388, 389, 390, 391, 392, 393, 394, 395, 396, 397, 398, 399, 400, 401, 402, 403, 404, 405, 406, 407, 408, 409, 410, 411, 412, 413, 414, 415, 416, 417, 418, 419, 420, 421, 422, 423, 424, 425, 426, 427, 428, 429, 430, 431, 432, 433, 434, 435, 436, 437, 438, 439, 440, 441, 442, 443, 444, 445, 446, 447, 448, 449, 450, 451, 452, 453, 454, 456, 457, 458, 459, 460, 461, 462, 463, 464, 465, 466, 467, 468, 469, 470, 471, 472, 473, 474, 475, 476, 477, 478, 479, 480, 481, 482, 483, 484, 485, 486, 487, 488, 489, 490, 491, 492, 493, 494, 495, 496, 497, 498, 499, 500, 501, 502, 503, 504, 505, 506, 507, 508, 509, 510, 511, 512, 513, 514, 515, 516, 517, 518, 519, 520, 521, 522, 523, 524, 525, 526, 527, 528, 529, 530, 531, 532, 534, 535, 536, 537, 538, 539, 540, 541, 542, 543, 545, 546, 547, 548, 549, 550, 551, 552, 553, 554, 555, 556, 557, 558, 559, 560, 561, 562, 563, 564, 565, 566, 567, 568, 569, 570, 571, 572, 573, 574, 575, 576, 577, 578, 579, 580, 581, 582, 583, 584, 585, 586, 588, 589, 590, 591, 592, 593, 594, 595, 596, 597, 598, 599, 600, 601, 602, 603, 604, 605, 606, 607, 608, 609, 610, 611, 612, 613, 614, 615, 616, 617, 618, 619, 620, 621, 622, 623, 624, 625, 627, 628, 629, 631, 632, 633, 634, 635, 636, 637, 638, 639, 640, 641, 642, 643, 644, 645, 646, 647, 648, 649, 650, 651, 652, 653, 654, 655, 656, 657, 658, 659, 660, 661, 662, 663, 664, 665, 666, 667, 668, 669, 670, 671, 672, 673, 674, 675, 676, 677, 678, 679, 680, 681, 682, 683, 684, 685, 686, 687, 688, 689, 690, 691, 692, 693, 694, 695, 696, 697, 698, 699, 700, 701, 702, 703, 704, 705, 706, 707, 708, 709, 710, 711, 712, 713, 714, 715, 716, 717, 718, 719, 720, 721, 722, 723, 724, 725, 726, 727, 728, 729, 730, 731, 732, 733, 734, 735, 736, 737, 738, 739, 740, 741, 742, 743, 744, 745, 746, 747, 748, 749, 750, 751, 752, 753, 754, 755, 756, 757, 758, 759, 760, 761, 762, 763, 764, 765, 766, 767, 768, 769, 770, 771, 772, 773, 774, 775, 776, 777, 778, 779, 780, 781, 782, 783, 784, 785, 786, 787, 788, 789, 790, 791, 792, 793, 794, 795, 796, 797, 798, 799, 800, 801, 802, 803, 804, 805, 806, 807, 808, 809, 810, 811, 812, 814, 815, 816, 817, 818, 819, 820, 821, 822, 823, 824, 825, 827, 828, 829, 830, 831, 832, 833, 834, 835, 836, 837, 838, 839, 840, 841, 842, 843, 844, 845, 846, 847, 848, 849, 850, 851, 852, 853, 854, 855, 856, 857, 858, 859, 860, 861, 862, 863, 864, 865, 866, 867, 868, 869, 870, 871, 872, 873, 874, 875, 876, 877, 878, 879, 880, 881, 882, 883, 884, 885, 886, 887, 888, 889, 890, 891, 892, 893, 894, 895, 896, 897, 898, 900, 901, 902, 903, 904, 906, 907, 908, 909, 910, 911, 912, 913, 914, 915, 916, 917, 918, 919, 920, 921, 922, 923, 924, 925, 926, 927, 928, 929, 930, 931, 932, 933, 934, 935, 936, 937, 938, 939, 940, 941, 942, 943, 944, 945, 946, 947, 948, 949, 950, 951, 952, 953, 954, 955, 956, 957, 958, 959, 960, 961, 962, 963, 964, 965, 966, 967, 968, 969, 970, 971, 972, 973, 974, 975, 976, 977, 978, 979, 980, 981, 982, 983, 984, 985, 986, 987, 988, 989, 990, 991, 992, 993, 994, 995, 996, 997, 998, 999, 1000, 1001);
    int ab = graph.searchInsert(test, 412);
    int a =1;
  }
  public int removeElement(List<Integer> a, int b) {
    int i =0;
    while(i < a.size())
    {
      if(a.get(i) - b  == 0)
      {
        a.remove(i);
      }
      else
        i++;
    }
    return a.size();
  }

  public int searchInsert(List<Integer> a, int b) {
    return findTarget(a, b, 0);
  }
  public int findTarget(List<Integer> a, int b, int index) {
    if(a.size() ==0)
      return index;
    if(a.size() == 1)
    {
      if(a.get(0) < b) return index+1;
      else return index;
    }
    int mid = a.size()/2;
    if(a.get(mid) < b )
      return findTarget(a.subList(mid+1, a.size()), b, index + mid +1  );
    else if (a.get(mid) == b)
      return index+mid;
    else if( a.get(mid) > b)
      return findTarget(a.subList(0, mid), b, index );
    return 0;
  }

  public int isBalanced(TreeNode a) {
    return isBalance(a).getValue()? 1: 0 ;
  }
  private Map.Entry<Integer, Boolean> isBalance(TreeNode a)
  {
    if(a == null)
      return new AbstractMap.SimpleEntry<Integer, Boolean>(0, true);
    Map.Entry<Integer, Boolean> leftKV =  isBalance(a.left)  ;
    leftKV = new AbstractMap.SimpleEntry<Integer, Boolean>(leftKV.getKey() +1 , leftKV.getValue());
    if(!leftKV.getValue())
      return new AbstractMap.SimpleEntry<Integer, Boolean>(leftKV.getKey(), false);
    Map.Entry<Integer, Boolean> rightKV = isBalance(a.right);
    rightKV = new AbstractMap.SimpleEntry<Integer, Boolean>(rightKV.getKey() +1 ,
        rightKV.getValue());

    if(rightKV.getValue() && Math.abs(leftKV.getKey() - rightKV.getKey()) <=1 )
      return new AbstractMap.SimpleEntry<Integer, Boolean>(Math.max(leftKV.getKey(),
          rightKV.getKey()), true);
    return new AbstractMap.SimpleEntry<Integer, Boolean>(Math.max(leftKV.getKey(), rightKV.getKey()), false);
  }



  private void shortestPath(Vertex start)
  {
    PriorityQueue<Vertex> priorityQueue = new PriorityQueue<>((Comparator) (o1, o2) -> {
      Vertex v1 = (Vertex) o1;
      Vertex v2 = (Vertex) o2;
      if(v1.distance < v2.distance) return -1;
      if(v1.distance == v2.distance) return 0;
      return +1;
    });
    start.distance = 0;
    priorityQueue.add(start);
    Vertex current = start;

    while(!priorityQueue.isEmpty())
    {
      current = priorityQueue.poll();
      for(Edge edge: weightedGraph.get(current))
      {
        if(edge.endVertex.color == 2)
          continue;
        int newDistance = current.distance + edge.weight;
        if(newDistance < edge.endVertex.distance)
        {
          edge.endVertex.distance = newDistance;
          if(edge.endVertex.color == 0)
            priorityQueue.add(edge.endVertex);
          if(edge.endVertex.color == 1)
          {
            priorityQueue.remove(edge.endVertex);
            priorityQueue.offer(edge.endVertex);
          }
          edge.endVertex.color = 1;
        }
      }
      current.color = 2;

    }


  }

  private void buildGraph()
  {
    Vertex v1 = Vertex.create("DELHI");
    Vertex v2 = Vertex.create("MUMBAI");
    Vertex v3 = Vertex.create("GOA");
    Vertex v4 = Vertex.create("KANPUR");
    Vertex v5 = Vertex.create("CHANDIGARH");

    weightedGraph.put(v1, Arrays.asList(Edge.create(v1, v2,10), Edge.create(v1, v3,20), Edge.create(v1, v4,15),Edge.create(v1, v5,2)) );
    weightedGraph.put(v2, Arrays.asList(Edge.create(v2, v1,10), Edge.create(v2, v3,2), Edge.create(v2, v4,3) ) );
    weightedGraph.put(v3, Arrays.asList(Edge.create(v3, v1,20), Edge.create(v3, v2,2), Edge.create(v3, v5,6)) );
    weightedGraph.put(v4, Arrays.asList(Edge.create(v4, v1,15), Edge.create(v4, v2,3), Edge.create(v4, v5,5)) );
    weightedGraph.put(v5, Arrays.asList(Edge.create(v5, v1,2), Edge.create(v5, v3,6), Edge.create(v5, v4,5)) );

  }

  static class Vertex
  {
    String text;
    int distance;
    int color;
    static HashSet<Vertex> store = new HashSet<>();
    private Vertex(String text)
    {
      this.text = text;
      distance = 100000;
      color =0;
    }
    public static Vertex create(String text)
    {
      for(Vertex v : store)
      {
        if(v.text.equals(text))
          return v;
      }
      Vertex v = new Vertex(text);
      store.add(v);
      return  v;
    }
  }
  static class Edge
  {
    Vertex startVertex;
    Vertex endVertex;
    int weight;
    static HashSet<Edge> store = new HashSet<>();
    private Edge(Vertex v1, Vertex v2, int weight)
    {
      this.startVertex = v1;
      this.endVertex = v2;
      this.weight = weight;
    }
    public static Edge create(Vertex v1, Vertex v2, int weight)
    {
      for(Edge each : store)
      {
        if(each.endVertex == v2 && each.startVertex == v1 && each.weight == weight)
          return each;
      }
      Edge edge = new Edge(v1,v2,weight);
      store.add(edge);
      return edge;

    }




  }



}
