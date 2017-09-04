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
        stations.add(new Station(new LatLng(10.396693185159075, -75.47218400985003), "Patio Portal", "Portal"));
        stations.add(new Station(new LatLng(10.395318694414842, -75.47797355800867), "Madre Bernarda", "MadBer"));
        stations.add(new Station(new LatLng(10.394422370176764, -75.48663575202227), "Castella", "Castel"));
        stations.add(new Station(new LatLng(10.39940125718577, -75.49363665282726), "Ejecutivos", "Ejecut"));
        stations.add(new Station(new LatLng(10.403626884266682, -75.49724891781807), "Villa Olimpica", "VillaO"));
        stations.add(new Station(new LatLng(10.406428548343861, -75.50229046493769), "Cuatro Vientos", "Cuatro"));
        stations.add(new Station(new LatLng(10.407331433313626, -75.50749864429235), "Líbanos", "Libano"));
        stations.add(new Station(new LatLng(10.395099395308025, -75.4903781041503), "Los Angeles", "LosAng"));
        stations.add(new Station(new LatLng(10.408296640177639, -75.5128898844123), "Barrio España", "Espana"));
    }

    public List<Station> getStations() {
        return stations;
    }

    public void setStations(List<Station> stations) {
        this.stations = stations;
    }
}
