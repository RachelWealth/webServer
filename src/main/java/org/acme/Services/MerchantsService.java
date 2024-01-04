package org.acme.Services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.acme.Models.Merchant;

public class MerchantsService {
    List<Merchant> merchants = new ArrayList<>(Arrays.asList(
        new Merchant("202 coffee bar"),
        new Merchant("101 coffee bar"),
        new Merchant("202 canteen"),
        new Merchant("101 canteen")
    ));

    
    
}
