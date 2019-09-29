package com.busurca;

public class FlourPacker {

        public static boolean canPack(int bigCount, int smallCount, int goal) {

            final int LARGE_PACK = 5;
            int largePacksHold = bigCount * LARGE_PACK;
            int canHold = largePacksHold + smallCount;
            int smallPacksNeeded = goal % LARGE_PACK;

            if(bigCount < 0 || smallCount < 0 || goal < 0) {
                return false;
            }

            if(goal < LARGE_PACK && smallPacksNeeded == 0) {
                return false;
            }

            if((canHold == goal ) || ((canHold > goal) && (smallPacksNeeded <= smallCount))) {
                return true;
            }

            return false;

        }

}
