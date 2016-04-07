package com.homeworks.Trees;

import java.util.*;

/**
 * Created by Akshay on 3/28/2016.
 */
public class Solution
{
  public static void main(String[] args)
  {
    Solution sol = new Solution(2);
    TreeNode root = TreeNode.create(Arrays.asList(7, 2, 3, 4, 5, -1, 7,9));
//    root = TreeNode.create(Arrays.asList(5,1,2,4,-1,5));
    List another = sol.inOrderTraversal(root);
    List another2 = sol.preOrderTraversal(root);
    List another3 = sol.postOrderTraversal(root);


    int ret = 0;
    //case 1
    ret = sol.get(2);
    sol.set(2,6);
    ret = sol.get(1);
    sol.set(1,5);
    sol.set(1,2);

    ret = sol.getVal(2);
    sol.setVal(2,6);
    ret =sol.getVal(1);
    sol.setVal(1,5);
    sol.setVal(1,2);

    //Case2
    sol.treeMap.clear();
    sol.set(2,1);
    sol.set(1,1);
    sol.set(2,3);
    sol.set(4,1);
    ret = sol.get(1);
    ret = sol.get(2);

    sol.setVal(2,1);
    sol.setVal(1,1);
    sol.setVal(2,3);
    sol.setVal(4,1);
    ret = sol.getVal(1);
    ret = sol.getVal(2);
    
    root = TreeNode.create(Arrays.asList(543, 0 ,2 ,0 ,1 ,0 ,2 ,2 ,1 ,0 ,0 ,1 ,2 ,1 ,1 ,2 ,1 ,2 ,1 ,0 ,0 ,2 ,0 ,2 ,2 ,-1 ,1 ,0 ,1 ,-1 ,1 ,2 ,2 ,2 ,1 ,1 ,-1 ,1 ,2 ,1 ,0 ,1 ,1 ,0 ,2 ,2 ,2 ,2 ,2 ,0 ,2 ,0 ,1 ,2 ,-1 ,-1 ,0 ,1 ,0 ,2 ,-1 ,2 ,1 ,0 ,-1 ,-1 ,2 ,1 ,0 ,-1 ,0 ,2 ,-1 ,-1 ,1 ,2 ,-1 ,-1 ,0 ,2 ,1 ,-1 ,1 ,0 ,0 ,-1 ,2 ,-1 ,-1 ,1 ,2 ,0 ,-1 ,-1 ,2 ,1 ,2 ,-1 ,1 ,1 ,0 ,2 ,2 ,0 ,-1 ,1 ,1 ,0 ,1 ,0 ,0 ,1 ,2 ,2 ,0 ,-1 ,1 ,2 ,0 ,-1 ,-1 ,-1 ,0 ,-1 ,2 ,2 ,-1 ,-1 ,0 ,-1 ,1 ,0 ,-1 ,-1 ,0 ,-1 ,1 ,-1 ,0 ,1 ,-1 ,1 ,0 ,0 ,-1 ,2 ,1 ,-1 ,0 ,0 ,0 ,0 ,-1 ,-1 ,-1 ,-1 ,2 ,1 ,-1 ,1 ,2 ,-1 ,0 ,1 ,1 ,2 ,0 ,-1 ,-1 ,0 ,-1 ,0 ,2 ,0 ,-1 ,1 ,-1 ,2 ,1 ,-1 ,0 ,-1 ,0 ,2 ,-1 ,0 ,2 ,0 ,1 ,0 ,-1 ,-1 ,-1 ,0 ,-1 ,-1 ,-1 ,-1 ,-1 ,2 ,-1 ,1 ,0 ,-1 ,1 ,0 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,0 ,-1 ,1 ,1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,1 ,0 ,-1 ,-1 ,-1 ,2 ,1 ,1 ,2 ,1 ,-1 ,-1 ,-1 ,1 ,-1 ,-1 ,-1 ,-1 ,-1 ,0 ,2 ,2 ,0 ,-1 ,-1 ,1 ,0 ,-1 ,1 ,1 ,1 ,-1 ,2 ,1 ,0 ,2 ,-1 ,1 ,2 ,-1 ,-1 ,-1 ,-1 ,2 ,2 ,1 ,1 ,-1 ,2 ,0 ,2 ,-1 ,-1 ,-1 ,1 ,2 ,-1 ,-1 ,-1 ,-1 ,0 ,1 ,1 ,-1 ,-1 ,-1 ,2 ,2 ,-1 ,-1 ,2 ,2 ,-1 ,-1 ,-1 ,1 ,0 ,-1 ,-1 ,2 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,0 ,-1 ,-1 ,1 ,-1 ,-1 ,1 ,2 ,-1 ,1 ,2 ,2 ,-1 ,-1 ,-1 ,2 ,-1 ,0 ,-1 ,0 ,2 ,2 ,0 ,2 ,-1 ,0 ,2 ,1 ,-1 ,0 ,-1 ,-1 ,2 ,-1 ,-1 ,-1 ,-1 ,-1 ,2 ,1 ,-1 ,0 ,2 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,2 ,-1 ,-1 ,-1 ,0 ,2 ,1 ,0 ,-1 ,-1 ,2 ,0 ,-1 ,-1 ,-1 ,1 ,1 ,-1 ,-1 ,-1 ,0 ,1 ,-1 ,-1 ,-1 ,-1 ,1 ,0 ,-1 ,0 ,0 ,-1 ,1 ,1 ,1 ,2 ,-1 ,-1 ,-1 ,1 ,1 ,-1 ,0 ,-1 ,-1 ,-1 ,2 ,-1 ,-1 ,-1 ,0 ,2 ,0 ,-1 ,-1 ,-1 ,-1 ,-1 ,1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,0 ,0 ,2 ,2 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,0 ,-1 ,-1 ,2 ,-1 ,-1 ,1 ,-1 ,-1 ,1 ,2 ,1 ,0 ,-1 ,-1 ,0 ,-1 ,2 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,2 ,-1 ,-1 ,2 ,-1 ,-1 ,2 ,-1 ,1 ,-1 ,-1 ,2 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,0 ,-1 ,-1 ,-1 ,1 ,1 ,-1 ,-1 ,1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,0 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,1 ,0 ,0 ,1 ,1 ,0 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ));
    another = sol.pathSum(root, 10);

    root = TreeNode.create(Arrays.asList(763 ,3 ,7 ,9 ,9 ,0 ,-1 ,-1 ,2 ,1 ,4 ,3 ,2 ,5 ,2 ,2 ,4 ,8 ,1 ,1 ,4 ,9 ,0 ,-1 ,8 ,3 ,5 ,2 ,5 ,-1 ,1 ,6 ,2 ,8 ,1 ,0 ,7 ,3 ,-1 ,7 ,-1 ,6 ,6 ,1 ,7 ,1 ,5 ,9 ,4 ,7 ,-1 ,7 ,-1 ,-1 ,-1 ,6 ,2 ,8 ,7 ,8 ,1 ,5 ,9 ,0 ,4 ,6 ,-1 ,-1 ,5 ,6 ,-1 ,2 ,1 ,8 ,2 ,5 ,5 ,-1 ,4 ,-1 ,1 ,9 ,1 ,4 ,3 ,5 ,7 ,4 ,-1 ,-1 ,0 ,6 ,7 ,5 ,-1 ,2 ,1 ,7 ,1 ,9 ,0 ,2 ,5 ,4 ,-1 ,-1 ,-1 ,-1 ,-1 ,8 ,2 ,2 ,-1 ,-1 ,-1 ,-1 ,-1 ,2 ,-1 ,3 ,9 ,4 ,8 ,8 ,6 ,4 ,7 ,2 ,5 ,7 ,1 ,-1 ,9 ,5 ,3 ,8 ,0 ,4 ,-1 ,-1 ,5 ,5 ,7 ,2 ,-1 ,-1 ,-1 ,8 ,0 ,4 ,4 ,5 ,5 ,7 ,-1 ,-1 ,5 ,6 ,3 ,-1 ,9 ,1 ,9 ,-1 ,8 ,-1 ,-1 ,9 ,-1 ,-1 ,8 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,6 ,7 ,3 ,-1 ,1 ,8 ,-1 ,-1 ,1 ,8 ,-1 ,-1 ,-1 ,8 ,0 ,0 ,5 ,6 ,-1 ,-1 ,0 ,-1 ,9 ,-1 ,5 ,-1 ,6 ,6 ,-1 ,6 ,2 ,6 ,5 ,-1 ,-1 ,7 ,3 ,1 ,6 ,-1 ,7 ,6 ,-1 ,-1 ,6 ,-1 ,3 ,9 ,-1 ,-1 ,-1 ,0 ,-1 ,2 ,-1 ,0 ,-1 ,7 ,3 ,5 ,-1 ,8 ,2 ,0 ,6 ,8 ,7 ,3 ,9 ,0 ,1 ,0 ,-1 ,-1 ,-1 ,0 ,8 ,7 ,2 ,9 ,-1 ,6 ,6 ,6 ,-1 ,2 ,3 ,2 ,-1 ,-1 ,1 ,1 ,4 ,8 ,-1 ,2 ,0 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,1 ,3 ,6 ,-1 ,-1 ,-1 ,-1 ,5 ,4 ,1 ,7 ,7 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,0 ,8 ,0 ,-1 ,5 ,5 ,-1 ,7 ,3 ,-1 ,-1 ,1 ,-1 ,-1 ,-1 ,7 ,9 ,4 ,-1 ,4 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,0 ,0 ,5 ,5 ,-1 ,-1 ,-1 ,2 ,6 ,8 ,1 ,-1 ,0 ,-1 ,6 ,-1 ,0 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,6 ,8 ,2 ,-1 ,4 ,2 ,-1 ,1 ,-1 ,-1 ,-1 ,2 ,1 ,0 ,2 ,7 ,8 ,-1 ,1 ,-1 ,-1 ,3 ,4 ,-1 ,-1 ,-1 ,-1 ,-1 ,5 ,-1 ,-1 ,8 ,2 ,-1 ,-1 ,-1 ,-1 ,2 ,8 ,-1 ,3 ,-1 ,8 ,6 ,3 ,-1 ,-1 ,-1 ,8 ,6 ,4 ,-1 ,-1 ,-1 ,-1 ,5 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,9 ,4 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,2 ,2 ,7 ,3 ,9 ,-1 ,-1 ,9 ,-1 ,-1 ,-1 ,-1 ,6 ,-1 ,3 ,8 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,3 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,4 ,-1 ,2 ,-1 ,-1 ,-1 ,-1 ,2 ,-1 ,-1 ,1 ,9 ,1 ,-1 ,-1 ,2 ,5 ,1 ,-1 ,-1 ,4 ,2 ,-1 ,-1 ,-1 ,7 ,6 ,3 ,8 ,2 ,8 ,-1 ,-1 ,0 ,-1 ,-1 ,3 ,1 ,-1 ,-1 ,5 ,-1 ,-1 ,9 ,-1 ,2 ,-1 ,0 ,-1 ,-1 ,-1 ,8 ,-1 ,-1 ,8 ,-1 ,-1 ,0 ,-1 ,0 ,-1 ,7 ,-1 ,-1 ,1 ,4 ,-1 ,9 ,5 ,3 ,-1 ,-1 ,-1 ,2 ,3 ,-1 ,-1 ,-1 ,6 ,7 ,-1 ,0 ,6 ,-1 ,-1 ,-1 ,-1 ,-1 ,5 ,-1 ,-1 ,-1 ,5 ,-1 ,-1 ,-1 ,-1 ,-1 ,4 ,8 ,3 ,-1 ,-1 ,9 ,5 ,-1 ,-1 ,-1 ,9 ,0 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,4 ,-1 ,7 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,4 ,0 ,-1 ,8 ,1 ,-1 ,5 ,-1 ,0 ,-1 ,-1 ,-1 ,-1 ,-1 ,1 ,1 ,0 ,-1 ,8 ,6 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,3 ,5 ,9 ,4 ,1 ,9 ,-1 ,-1 ,-1 ,-1 ,-1 ,6 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,5 ,-1 ,-1 ,9 ,-1 ,-1 ,0 ,-1 ,-1 ,-1 ,-1 ,0 ,1 ,-1 ,3 ,-1 ,8 ,-1 ,1 ,-1 ,-1 ,-1 ,-1 ,2 ,5 ,6 ,2 ,6 ,-1 ,6 ,6 ,4 ,-1 ,9 ,-1 ,-1 ,-1 ,-1 ,5 ,8 ,-1 ,-1 ,-1 ,-1 ,-1 ,1 ,-1 ,-1 ,-1 ,-1 ,5 ,-1 ,7 ,-1 ,-1 ,-1 ,-1 ,9 ,4 ,2 ,1 ,8 ,-1 ,-1 ,-1 ,3 ,4 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,5 ,-1 ,-1 ,-1 ,-1 ,-1 ,4 ,-1 ,9 ,-1 ,-1 ,-1 ,3 ,-1 ,-1 ,3 ,-1 ,-1 ,7 ,4 ,1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,-1 ,7 ,8 ,-1 ,9 ,0 ,-1 ,-1 ,-1 ,2 ,6 ,-1 ,8 ,-1 ,-1 ,-1 ,-1 ,-1 ,2 ,-1 ,4 ,2 ,-1 ,-1 ,6 ,8 ,-1 ,-1 ,-1 ,-1 ,-1 ,4 ,-1 ,-1));
    //int res = sol.sumNumbers(root);

    root = sol.buildTree(Arrays.asList(622, 284, 289, 302, 7, 301, 554, 103, 202, 25, 359, 171, 40, 191, 324, 184, 609, 618, 649, 380, 106, 386, 417, 495, 400, 70, 31, 197, 419, 199, 482, 214, 437, 489, 275, 652, 485, 616, 21, 636, 544, 604, 404, 89, 60, 436, 205, 506, 521, 248, 389, 221, 402, 638, 182, 204, 635, 532, 287, 352, 395, 229, 370, 582, 325, 203, 20, 110, 426, 319, 473, 439, 156, 251, 178, 28, 411, 88, 381, 526, 2, 580, 527, 50, 536, 349, 640, 486, 317, 11, 396, 172, 230, 22, 258, 135, 373, 549, 26, 606, 133, 247, 66, 206, 315, 577, 650, 413, 113, 327, 322, 641, 628, 658, 175, 165, 430, 81, 335, 438, 356, 424, 475, 257, 45, 209, 155, 620, 34, 460, 585, 643, 41, 351, 391, 484, 80, 510, 261, 101, 348, 189, 550, 152, 571, 589, 563, 338, 127, 190, 210, 505, 1, 72, 333, 595, 579, 164, 279, 42, 340, 614, 262, 594, 654, 503, 401, 44, 516, 523, 368, 456, 421, 259, 3, 556, 472, 524, 117, 457, 508, 541, 27, 512, 337, 241, 93, 299, 515, 231, 588, 255, 459, 379, 487, 292, 339, 453, 442, 537, 23, 423, 33, 621, 418, 160, 548, 161, 446, 146, 511, 578, 124, 68, 632, 568, 61, 252, 173, 90, 445, 95, 539, 374, 94, 384, 104, 211, 343, 157, 547, 543, 83, 490, 131, 200, 97, 274, 10, 92, 67, 342, 639, 276, 290, 243, 64, 390, 87, 552, 365, 597, 102, 303, 644, 56, 266, 596, 320, 326, 91, 86, 448, 567, 561, 566, 392, 656, 344, 99, 477, 646, 509, 358, 298, 234, 85, 613, 629, 311, 458, 84, 406, 213, 364, 465, 120, 651, 434, 224, 305, 52, 177, 466, 530, 451, 534, 514, 237, 569, 236, 653, 633, 8, 377, 617, 452, 316, 447, 573, 435, 555, 385, 648, 306, 397, 296, 612, 96, 76, 218, 17, 625, 119, 176, 615, 15, 166, 492, 519, 478, 367, 517, 657, 558, 366, 584, 278, 403, 62, 121, 198, 345, 71, 240, 440, 4, 283, 138, 293, 313, 463, 112, 159, 314, 491, 378, 141, 409, 238, 48, 383, 272, 630, 399, 215, 462, 599, 219, 341, 601, 422, 232, 188, 222, 201, 470, 216, 429, 264, 270, 321, 74, 151, 256, 281, 297, 29, 474, 412, 168, 323, 336, 46, 494, 245, 350, 123, 59, 30, 542, 394, 253, 269, 444, 581, 645, 332, 347, 273, 174, 6, 393, 185, 19, 98, 431, 49, 369, 169, 553, 310, 128, 126, 58, 471, 170, 608, 57, 47, 282, 583, 137, 520, 181, 295, 100, 235, 260, 538, 626, 12, 132, 647, 499, 330, 39, 461, 268, 249, 469, 250, 36, 154, 372, 602, 18, 196, 300, 427, 162, 631, 420, 223, 454, 360, 129, 528, 564, 312, 55, 443, 405, 69, 280, 187, 513, 497, 233, 304, 498, 122, 500, 375, 570, 116, 109, 607, 139, 493, 9, 488, 153, 271, 531, 363, 194, 180, 634, 408, 655, 82, 455, 557, 125, 560, 354, 163, 619, 331, 388, 600, 239, 226, 14, 108, 145, 294, 576, 586, 450, 291, 107, 410, 136, 115, 546, 496, 318, 54, 502, 415, 416, 334, 611, 179, 13, 193, 140, 242, 559, 533, 545, 220, 111, 134, 637, 75, 37, 150, 592, 267, 382, 53, 158, 483, 590, 212, 605, 208, 479, 603, 143, 167, 407, 642, 227, 529, 562, 480, 535, 522, 142, 246, 217, 627, 414, 78, 357, 572, 38, 432, 51, 328, 387, 309, 565, 228, 518, 183, 587, 551, 428, 105, 308, 5, 244, 464, 77, 79, 574, 263, 285, 225, 130, 24, 286, 355, 593, 192, 362, 398, 376, 144, 598, 346, 118, 307, 16, 591, 624, 149, 623, 207, 148, 65, 501, 575, 610, 481, 353, 186, 540, 73, 449, 476, 254, 504, 43, 525, 467, 32, 265, 425, 441, 433, 288, 195, 63, 361, 35, 371, 147, 114, 507, 329, 277, 468),
        Arrays.asList(301, 7, 302, 103, 554, 202, 289, 359, 25, 171, 284, 191, 324, 184, 609, 40, 618, 622, 495, 417, 70, 400, 197, 31, 386, 199, 419, 214, 482, 106, 652, 21, 636, 616, 485, 544, 275, 404, 89, 604, 436, 60, 489, 389, 221, 402, 248, 521, 506, 204, 532, 635, 182, 638, 395, 352, 287, 229, 205, 325, 203, 582, 370, 319, 473, 426, 156, 439, 251, 178, 110, 88, 526, 381, 411, 580, 2, 28, 20, 50, 527, 437, 536, 349, 380, 172, 230, 396, 135, 373, 549, 606, 26, 258, 206, 66, 315, 247, 650, 413, 577, 327, 113, 133, 22, 628, 641, 165, 175, 430, 658, 335, 81, 322, 424, 356, 438, 257, 475, 209, 155, 45, 34, 620, 11, 351, 391, 41, 643, 510, 261, 80, 348, 101, 484, 571, 152, 550, 589, 563, 189, 338, 127, 1, 505, 72, 210, 190, 333, 585, 340, 42, 279, 262, 614, 164, 654, 594, 579, 503, 401, 595, 523, 456, 368, 516, 3, 259, 421, 44, 556, 524, 472, 117, 460, 317, 541, 512, 27, 508, 457, 515, 231, 299, 93, 241, 255, 588, 337, 487, 339, 292, 453, 379, 23, 537, 442, 33, 423, 459, 548, 160, 418, 621, 446, 161, 511, 146, 578, 486, 252, 173, 90, 61, 568, 95, 445, 374, 539, 632, 104, 384, 343, 211, 94, 547, 157, 543, 68, 131, 97, 200, 10, 92, 274, 342, 67, 276, 639, 490, 290, 64, 390, 87, 243, 552, 83, 365, 124, 102, 644, 303, 56, 266, 597, 86, 91, 326, 448, 320, 596, 392, 566, 656, 561, 567, 344, 640, 509, 646, 358, 234, 298, 477, 613, 458, 311, 84, 629, 406, 85, 99, 465, 364, 120, 213, 434, 224, 305, 651, 466, 177, 530, 52, 514, 237, 569, 534, 451, 649, 452, 617, 447, 573, 316, 555, 385, 435, 377, 648, 306, 8, 296, 397, 633, 612, 625, 119, 17, 218, 15, 615, 492, 166, 519, 176, 76, 96, 657, 517, 367, 558, 478, 653, 121, 198, 62, 403, 240, 440, 4, 71, 293, 138, 283, 463, 313, 345, 112, 278, 314, 159, 584, 409, 48, 383, 238, 272, 630, 399, 141, 378, 462, 215, 341, 422, 601, 219, 222, 188, 201, 232, 470, 599, 429, 270, 321, 264, 151, 256, 74, 216, 281, 297, 491, 474, 29, 323, 168, 494, 245, 46, 336, 412, 123, 350, 59, 366, 269, 253, 444, 581, 645, 394, 347, 332, 174, 273, 6, 542, 185, 393, 98, 19, 49, 310, 553, 169, 128, 369, 608, 170, 57, 471, 47, 58, 126, 431, 282, 181, 295, 520, 626, 538, 260, 12, 235, 647, 132, 100, 137, 461, 268, 249, 39, 330, 499, 154, 36, 250, 469, 300, 196, 162, 427, 18, 454, 223, 420, 631, 360, 528, 129, 602, 443, 405, 69, 55, 280, 312, 513, 187, 564, 372, 498, 304, 122, 233, 497, 375, 500, 583, 139, 607, 493, 9, 488, 109, 153, 116, 570, 194, 363, 531, 180, 271, 634, 408, 30, 557, 354, 163, 619, 560, 331, 125, 455, 239, 226, 600, 14, 388, 294, 586, 576, 145, 108, 107, 291, 450, 136, 115, 410, 496, 318, 54, 502, 546, 415, 82, 13, 179, 193, 611, 140, 334, 559, 242, 533, 545, 111, 134, 220, 150, 37, 75, 637, 416, 592, 655, 158, 53, 483, 590, 382, 267, 167, 143, 603, 479, 407, 642, 208, 227, 605, 480, 535, 562, 529, 246, 142, 522, 212, 236, 217, 572, 357, 432, 38, 51, 328, 78, 183, 518, 587, 228, 551, 428, 565, 244, 5, 308, 464, 105, 574, 79, 263, 77, 285, 309, 130, 362, 192, 398, 376, 593, 355, 286, 24, 225, 387, 346, 598, 118, 307, 144, 16, 591, 624, 414, 148, 207, 65, 623, 610, 575, 501, 149, 627, 449, 73, 540, 476, 186, 353, 467, 525, 43, 32, 265, 504, 254, 425, 481, 195, 35, 371, 361, 63, 147, 288, 114, 433, 329, 507, 441, 468, 277 ));

    root = sol.buildTree(Arrays.asList(2,3,4,5), Arrays.asList(2,4,3,5));
    int stop =1;
  }

  private TreeNode buildTree(List<Integer> preorder, List<Integer> inorder) {
    if(inorder == null || inorder.size()==0) return null;
    if(inorder.size()==1) return new TreeNode(inorder.get(0));
    if(preorder == null || preorder.size()==0) return null;
    if(preorder.size()==1)
        return new TreeNode(preorder.get(0));

    TreeNode node = new TreeNode(preorder.get(0));
    int index = 0;
    while(index < inorder.size() && inorder.get(index) != preorder.get(0))
      index++;
    node.left = buildTree(preorder.subList(1, preorder.size()), inorder.subList(0, index));
    node.right = index == inorder.size() ? null: buildTree(preorder.subList(index+1, preorder.size()),
        inorder.subList(index+1, inorder.size()));
    return node;
  }

  public TreeNode sortedArrayToBST(final List<Integer> a) {
    if(a == null || a.size()==0) return null;
    if(a.size() == 1) return new TreeNode(a.get(0));

    int midPoint = a.size()/2;
    TreeNode node = new TreeNode(a.get(midPoint));
    node.left = sortedArrayToBST(a.subList(0, midPoint));
    node.right = sortedArrayToBST(a.subList(midPoint+1, a.size()));
    return  node;
  }


  public void connect(TreeLinkNode root) {
    TreeLinkNode iter = root, prev =null;
    if(root ==null)
      return;
    root.next = null;
    while(iter!=null)
    {
      TreeLinkNode iter2 = iter;
      while(iter2!=null)
      {
        if(iter2.left!=null)
        {

          iter2.left.next = iter2.right;

        }
        if(iter2.right!=null)
          iter2.right.next = getNextRight(iter2);
        iter2 = iter2.next;
      }
      if(iter.left !=null)
        iter = iter.left;
      else if (iter.right != null)
        iter = iter.right;
      else
        iter = getNextRight(iter);
    }
  }

  private TreeLinkNode getNextRight(TreeLinkNode p)
  {
    TreeLinkNode temp = p.next;
    while(temp!=null)
    {
      if(temp.left!=null)
        return temp.left;
      if(temp.right != null)
        return temp.right;
      temp = temp.next;
    }
    return null;
  }

  private ArrayList<Integer> inOrderTraversal(TreeNode root)
  {
    ArrayList<Integer> retList = new ArrayList<>();
    Deque<TreeNode> stack = new LinkedList<>();
    TreeNode current = root;
    while(current!=null || !stack.isEmpty())
    {
      if(current !=null)
      {
        stack.addFirst(current);
        current = current.left;
        continue;
      }
      TreeNode popped = stack.removeFirst();
      retList.add(popped.val);
      if(popped.right!=null)
      {
        current = popped.right;
      }
    }
    return retList;
  }

  private ArrayList<Integer> preOrderTraversal(TreeNode root)
  {
    ArrayList<Integer> retList = new ArrayList<>();
    Deque<TreeNode> stack = new LinkedList<>();
    stack.addFirst(root);
    while(!stack.isEmpty())
    {
      TreeNode popped = stack.removeFirst();
      retList.add(popped.val);
      if(popped.right!=null)
        stack.addFirst(popped.right);
      if(popped.left !=null)
        stack.addFirst(popped.left);
    }
    return retList;
  }

  private ArrayList<Integer> postOrderTraversal(TreeNode root)
  {
    ArrayList<Integer> retList = new ArrayList<>();
    Deque<TreeNode> stack = new LinkedList<>();
    stack.addFirst(root);
    TreeNode previous = null;
    while(!stack.isEmpty())
    {
      TreeNode current = stack.peekFirst();
      if(previous == null || previous.left == current || previous.right == current )
      {
        if(current.left!=null)
          stack.addFirst(current.left);
        else if (current.right !=null)
          stack.addFirst(current.right);
        else
          retList.add(stack.removeFirst().val);
      }
      else if( current.left == previous)
      {
        if(current.right !=null)
          stack.addFirst(current.right);
        else
          retList.add(stack.removeFirst().val);
      }
      else if(current.right == previous)
        retList.add(stack.removeFirst().val);
      previous = current;
    }
    return retList;
  }

  public ArrayList<ArrayList<Integer>> levelOrder(TreeNode a) {
    ArrayList<ArrayList<Integer>> retList = new ArrayList<ArrayList<Integer>>();
    ArrayList<Integer> each = new ArrayList<>();

    Queue<TreeNode> current = new LinkedList<>();
    Queue<TreeNode> next = new LinkedList<>();
    current.add(a);
    while(!current.isEmpty())
    {
      TreeNode curr = current.remove();
      if(curr.left!=null)
        next.add(curr.left);
      if(curr.right!=null)
        next.add(curr.right);
      each.add(curr.val);
      if(current.isEmpty())
      {
        current = next;
        next = new LinkedList<>();
        retList.add(each);
        each = new ArrayList<>();
      }
    }
    return retList;
  }


  public int hasPathSum(TreeNode a, int b) {
    return hasPathSum(a, b, 0);
  }

  private int hasPathSum(TreeNode a, int limit, int sum)
  {
    if(a == null)
      return 0;
    if(sum + a.val == limit)
      return 1;
    if(sum + a.val > limit)
      return 0;
    sum += a.val;
    boolean hasit = false;
    return hasPathSum(a.left, limit, sum) == 1 ?  1 :  hasPathSum(a.right, limit, sum);
  }


  public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
    ArrayList<ArrayList<Integer>> retList = new ArrayList<>();
    pathSum(root, sum, 0, new ArrayList<Integer>(), retList);
    return retList;

  }
  private void pathSum(TreeNode node, int sum, int currentSum, List<Integer> list, ArrayList<ArrayList<Integer>>retList )	{
    if(node == null) return ;
    if(node.left ==null && node.right == null)
    {
      if(sum == node.val+currentSum)
      {
        ArrayList<Integer> myList = new ArrayList<>(list);
        myList.add(node.val);
        retList.add(myList);
        return;
      }
      else
        return;
    }
    list.add(node.val);
    pathSum(node.left, sum, currentSum+ node.val, list, retList);
    pathSum(node.right, sum, currentSum + node.val, list, retList);
    list.remove(list.size()-1);

  }

  public int sumNumbers(TreeNode a) {
    return sumNumbers(a, "", 0)%1003;
  }

  private int sumNumbers(TreeNode a, String currNum, int sumSofar)
  {
    if(a==null) return -1;
    if(a.left == null && a.right ==null)
    {
      int num = Integer.parseInt(currNum+a.val);
      return num;
    }

    int leftSum = sumNumbers(a.left, currNum+a.val, sumSofar );
    int rightSum = sumNumbers(a.right, currNum+a.val, sumSofar);

    if(rightSum !=-1)
      sumSofar +=rightSum;
    if(leftSum!=-1)
      sumSofar+=leftSum;

    return sumSofar;
  }

  //LRU implementation with just HashMap and LinkedList

  Value head, tail;
  HashMap<Integer, Value> hashMap;
  class Value
  {
    int val, key;
    Value next, previous;

    Value(int num, int key1)
    {
      val = num;
      key = key1;
    }
  }

  public int getVal(int key)
  {
    if(hashMap.containsKey(key))
    {
      Value value = hashMap.get(key);
      Value node = head;
      while(node.key!=value.key && node.val!= value.val)
      {
        node = node.next;
      }
      if(node.previous!=null)
        node.previous.next = node.next;
      if(node.next!=null)
        node.next.previous = node.previous;
      if(node == head)
        head = node.next;
      if(node == tail)
        tail = tail.previous;

      head.previous = value;
      value.next = head;
      head = value;
      return value.val;
    }
    return -1;
  }
  public void setVal(int key, int value )
  {
    Value newVal = new Value(value, key);
    if(hashMap.containsKey(key))
    {
      if(head ==null || tail == null)
        return;
      Value node = head;
      while( node.key!=newVal.key  )
      {
        node = node.next;
      }
      if(node.previous!=null)
        node.previous.next = node.next;
      if(node.next!=null)
        node.next.previous = node.previous;
      if(node == head)
        head = node.next;
      if(node == tail)
        tail = tail.previous;

      head.previous = newVal;
      newVal.next = head;
      head = newVal;
      hashMap.remove(key);
      hashMap.put(key, newVal);
    }else
    {

      if(hashMap.size() == capacity)
      {
        if(head ==null || tail == null)
            return ;
        hashMap.remove(tail.key);
        tail = tail.previous;
        tail.next =null;
        head.previous = newVal;
        newVal.next = head;
        head = newVal;
        hashMap.put(key, newVal);
      }
      else
      {
        hashMap.put(key, newVal );
        if(head == null) {
          head = newVal;
        }
        else
        {
          head.previous = newVal;
          newVal.next = head;
          head = newVal;
        }
        if(tail == null)
          tail = newVal;
        else
        {
          tail.previous = newVal;
        }
      }
    }

  }


  // LRU implementation using treeMap

  TreeMap<Key, Integer > treeMap;
  int capacity;
  int counter ;
  public Solution(int capacity) {
    treeMap = new TreeMap<>();
    this.capacity = capacity;
    this.counter=0;
    hashMap = new HashMap<>();
  }

  public int get(int key) {
    Key key1 = new Key(key,counter++);
    return getValueIfContained(treeMap, key1, -1);
  }

  private int getValueIfContained(TreeMap<Key, Integer> treeMap, Key key, int value)
  {
    for(Key each: treeMap.keySet())
    {
      if(each.equals(key))
      {
        int val = treeMap.get(each);
        treeMap.remove(each);
        if(value == -1)
          treeMap.put(key,val);
        else
          treeMap.put(key,value);
        return val;
      }
    }
    return -1;
  }

  public void set(int key, int value) {
    Key key1 = new Key(key,counter++);
    int retVal = getValueIfContained(treeMap, key1, value);
    if(retVal !=-1) return;

    if(treeMap.size() == capacity)
      treeMap.remove(treeMap.lastKey());
    treeMap.put(key1, value);
  }

  class Key implements Comparable<Key>
  {
    int num;
    long time;
    Key(int num, long time)
    {
      this.num = num;
      this.time = time;
    }
    @Override
    public int compareTo(Key o1)
    {
      if(this.num == o1.num)
          return 0;

      if(this.time < o1.time)
        return 1;
      else if (this.time > o1.time)
        return -1;
      else
        return 0;
    }
    @Override
    public int hashCode()
    {
      return Integer.hashCode(num);
    }
    @Override
    public boolean equals(Object o)
    {
      if(o instanceof Key){
        Key toCompare = (Key) o;
        return this.num == toCompare.num;
      }
      return false;

    }

  }

}
