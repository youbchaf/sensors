package ensa.ma.sensors.beans;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import androidx.core.content.ContextCompat;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class  SensorItem {
        public final String id;
        public final String name;
        public final String type;
        public final String vendor;
        public final String version;
        public final String resolution;
        public final String besoinEnergie;
        public final String maxRange;
        public final String intType;
        public final String vitesseMax;


    public SensorItem(String id, String name, String type, String vendor, String version, String resolution, String besoinEnergie,String maxRange, String intType, String vitesseMax) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.vendor = vendor;
        this.version = version;
        this.resolution = resolution;
        this.besoinEnergie = besoinEnergie;
        this.maxRange = maxRange;
        this.intType = intType;
        this.vitesseMax = vitesseMax;
    }



    @Override
        public String toString() {
            return name;
        }

}
