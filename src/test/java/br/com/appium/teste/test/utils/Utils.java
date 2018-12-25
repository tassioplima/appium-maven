package br.com.appium.teste.test.utils;

import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.Map;

import br.com.appium.teste.test.model.JSON;
import org.openqa.selenium.remote.DesiredCapabilities;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Utils {
	
	public static DesiredCapabilities pathToDesiredCapabilitites(String path) {
		try {
			Gson gson = new Gson();
			Type type = new TypeToken<Map<String, ?>>(){}.getType();
			Map<String , ?> map =  gson.fromJson(new FileReader(path), type);
			return new DesiredCapabilities(map);
        } catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}

	public static JSON pathToJSON(String path) {
		try {
			Gson gson = new Gson();
			Type type = new TypeToken<JSON>(){}.getType();
			return gson.fromJson(new FileReader(new File(path).getAbsolutePath()), type);
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}
}
