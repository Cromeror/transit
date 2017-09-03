package com.blastic.transcaribeapp.data.model;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Cristobal Romero Rossi
 *         Created by crross on 3/09/17.
 */

public class Stations {
    private List<Station> stations;

    public Stations() {
        stations = new ArrayList<>();

        stations.add(new Station(new LatLng(10.420180937628208, -75.55137991905214), "Bodeguita", "Bodegu"));
        stations.add(new Station(new LatLng(10.424992564239261, -75.5466977879405), "Centro", "Centro"));
        stations.add(new Station(new LatLng(10.42602696192436, -75.54047036916018), "Chambacú", "Chamba"));
        stations.add(new Station(new LatLng(10.422360555656612, -75.53470864892006), "Lo Amador", "LoAmad"));
        stations.add(new Station(new LatLng(10.420523874002122, -75.53107727319002), "La Popa", "LaPopa"));
        stations.add(new Station(new LatLng(10.416561616885707, -75.52790757268667), "Las Delicias", "LasDel"));
        stations.add(new Station(new LatLng(10.413785105101141, -75.52402205765247), "Bazurto", "Bazurt"));
        stations.add(new Station(new LatLng(10.411143438926512, -75.51958668977021), "El Prado", "ELPrad"));
        stations.add(new Station(new LatLng(10.408994080244867, -75.5158232152462), "Maria Auxiliadora", "MraAux"));

        stations.add(new Station(new LatLng(10.395318694414842, -75.47797355800867), "Madre Bernarda", "MadBer"));

    }

    public List<Station> getStations() {
        return stations;
    }

    public void setStations(List<Station> stations) {
        this.stations = stations;
    }
}
