package br.com.appium.teste.test.model;

import br.com.appium.teste.test.utils.Utils;

public enum JSONs {

    TESTE("massa/data/teste.json");

    private String jsonPath;

    JSONs(String jsonPath){
        this.jsonPath = jsonPath;
    }

    public JSON getJSON (){
        return Utils.pathToJSON(this.jsonPath);
    }

}
