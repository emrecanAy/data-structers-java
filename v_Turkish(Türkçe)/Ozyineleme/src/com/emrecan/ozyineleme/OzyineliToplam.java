package com.emrecan.ozyineleme;

/**
 * @author Emrecan
 * @created 12/12/2021 - 16:47
 */
public class OzyineliToplam {

    public int topla(int n){
        int araToplam = 0;
        if(n == 1){
            return 1;
        }
        araToplam += n + topla(n-1);
        return araToplam;
    }

}
