//
//
//public class Main {
////    private static Map<String, HeavenlyBody> solarSystem = new HashMap<>();
////    private static Set<HeavenlyBody> planets = new HashSet<>();
////
////    public static void main(String[] args) {
////        HeavenlyBody temp = new HeavenlyBody("Mercury", 88, bodyType);
////        solarSystem.put(temp.getName(), temp);
////        planets.add(temp);
////
////        temp = new HeavenlyBody("Venus", 225, bodyType);
////        solarSystem.put(temp.getName(), temp);
////        planets.add(temp);
////
////        temp = new HeavenlyBody("Earth", 365, bodyType);
////        solarSystem.put(temp.getName(), temp);
////        planets.add(temp);
////
////        HeavenlyBody tempMoon = new HeavenlyBody("Moon", 27, bodyType);
////        solarSystem.put(tempMoon.getName(), tempMoon);
////        temp.addMoon(tempMoon);
////
////        temp = new HeavenlyBody("Mars", 687, bodyType);
////        solarSystem.put(temp.getName(), temp);
////        planets.add(temp);
////
////        tempMoon = new HeavenlyBody("Deimos", 1.3, bodyType);
////        solarSystem.put(tempMoon.getName(), tempMoon);
////        temp.addMoon(tempMoon); // temp is still Mars
////
////        tempMoon = new HeavenlyBody("Phobos", 0.3, bodyType);
////        solarSystem.put(tempMoon.getName(), tempMoon);
////        temp.addMoon(tempMoon); // temp is still Mars
////
////        temp = new HeavenlyBody("Jupiter", 4332, bodyType);
////        solarSystem.put(temp.getName(), temp);
////        planets.add(temp);
////
////        tempMoon = new HeavenlyBody("Io", 1.8, bodyType);
////        solarSystem.put(tempMoon.getName(), tempMoon);
////        temp.addMoon(tempMoon); // temp is still Jupiter
////
////        tempMoon = new HeavenlyBody("Europa", 3.5, bodyType);
////        solarSystem.put(tempMoon.getName(), tempMoon);
////        temp.addMoon(tempMoon); // temp is still Jupiter
////
////        tempMoon = new HeavenlyBody("Ganymede", 7.1, bodyType);
////        solarSystem.put(tempMoon.getName(), tempMoon);
////        temp.addMoon(tempMoon); // temp is still Jupiter
////
////        tempMoon = new HeavenlyBody("Callisto", 16.7, bodyType);
////        solarSystem.put(tempMoon.getName(), tempMoon);
////        temp.addMoon(tempMoon); // temp is still Jupiter
////
////        temp = new HeavenlyBody("Saturn", 10759, bodyType);
////        solarSystem.put(temp.getName(), temp);
////        planets.add(temp);
////
////        temp = new HeavenlyBody("Uranus", 30660, bodyType);
////        solarSystem.put(temp.getName(), temp);
////        planets.add(temp);
////
////        temp = new HeavenlyBody("Neptune", 165, bodyType);
////        solarSystem.put(temp.getName(), temp);
////        planets.add(temp);
////
////        temp = new HeavenlyBody("Pluto", 248, bodyType);
////        solarSystem.put(temp.getName(), temp);
////        planets.add(temp);
////
////        System.out.println("Planets");
////        for(HeavenlyBody planet : planets) {
////            System.out.println("\t" + planet.getName());
////        }
////
////        HeavenlyBody body = solarSystem.get("Mars");
////        System.out.println("Moons of " + body.getName());
////        for(HeavenlyBody jupiterMoon: body.getSatellites()) {
////            System.out.println("\t" + jupiterMoon.getName());
////        }
////
////        Set<HeavenlyBody> moons = new HashSet<>();
////        for(HeavenlyBody planet : planets) {
////            moons.addAll(planet.getSatellites());
////        }
////
////        System.out.println("All Moons");
////        for(HeavenlyBody moon : moons) {
////            System.out.println("\t" + moon.getName());
////        }
////
////        HeavenlyBody pluto = new HeavenlyBody("Pluto", 842, bodyType);
////        planets.add(pluto);
////
////        for(HeavenlyBody planet : planets) {
////            System.out.println(planet.getName() + ": " + planet.getOrbitalPeriod());
////        }
////
////        Object o = new Object();
////        o.equals(o);
////        "pluto".equals("");
////
////
////
////    }
//}
