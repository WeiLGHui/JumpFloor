package com.xatu.Test;

/**
 * @Auther WeiLGHui
 * @Date 2020-03-30 14:18
 */

/**
 * 问题描述
 *      一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 */
public class TestJumpFloor {
    public static int JumpFloor(int target){
        if(target == 1 || target == 2){  //递归结束条件
            return target;
        }
        while(target > 2){
            return JumpFloor(target-1)+JumpFloor(target-2);
        }
        return 0;
    }
}
