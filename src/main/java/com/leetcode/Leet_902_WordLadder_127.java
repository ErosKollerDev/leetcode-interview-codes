package com.leetcode;

import java.util.Arrays;
import java.util.List;

/**
 * A transformation sequence from word beginWord to word endWord using a dictionary wordList is a sequence of words beginWord -> s1 -> s2 -> ... -> sk such that:
 * <p>
 * Every adjacent pair of words differs by a single letter.
 * Every si for 1 <= i <= k is in wordList. Note that beginWord does not need to be in wordList.
 * sk == endWord
 * Given two words, beginWord and endWord, and a dictionary wordList, return the number of words in the shortest transformation sequence from beginWord to endWord, or 0 if no such sequence exists.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log","cog"]
 * Output: 5
 * Explanation: One shortest transformation sequence is "hit" -> "hot" -> "dot" -> "dog" -> cog", which is 5 words long.
 * Example 2:
 * <p>
 * Input: beginWord = "hit", endWord = "cog", wordList = ["hot","dot","dog","lot","log"]
 * Output: 0
 * Explanation: The endWord "cog" is not in wordList, therefore there is no valid transformation sequence.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= beginWord.length <= 10
 * endWord.length == beginWord.length
 * 1 <= wordList.length <= 5000
 * wordList[i].length == beginWord.length
 * beginWord, endWord, and wordList[i] consist of lowercase English letters.
 * beginWord != endWord
 * All the words in wordList are unique.
 * <p>
 * https://leetcode.com/problems/word-ladder/
 */
public class Leet_902_WordLadder_127 {
    public static void main(String[] args) {
        Leet_902_WordLadder_127 leet = new Leet_902_WordLadder_127();
    leet.ladderLength("hit","cog", Arrays.asList("hot","dot","dog","lot","log","cog"));
    }

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

        return 0;
    }
}