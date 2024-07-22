import java.util.Random;

public class RandomResponse {
    public static void main(String[] args) {
        String[] respuestas = {
            "Cansado de los anuncios? Suscríbete! HoldThisL",
            "Hola, recuerda que Meys te quiere mucho :3 gracias por estar aquí uwu",
            "Todo Agosto estará lleno de minieventos por mi aniv. de afiliado, preparados? Perhaps.",
            "El canal ya cuenta con donoclip. Qué esperas para utilizarlo? NecoArc",
            "Interesado en la tienda de Fortnite? Usa mi código de creador: Meys MinecraftTime",
            "Te recuerdo que hay server de !discord para no perderte de nada",
            "Puedes usar Twitch Prime para tener una subscripción Gratis en el canal! Solo tienes que vincular tu cuenta de Twitch en tu perfil: gaming.amazon.com/",
            "Hey!! Ya te suscribiste a mis canales de yt? Entra aquí https://linkfly.to/60116MJpDuh para conocerlos HoldThisL",
            "Si tienes tirones o se corta el stream es cosa de Twitch, presiona F5 o pausa un momento, el stream sigue! HoldThisL",
            "Gracias por estar aquí, puedes apoyarme haciendo !autoraid. Así llego a más personitas ugu",
            "Cómo tan muchacho? , yo los veo muy bien verdad?",
            "Usa los meteoritus para que un bot me lea tu mensaje!!! Bv",
            "Hay dinámicas mensuales en el canal, escribe !evento para no perderte de ninguna peepoPls",
            "ME LA COMO ENTERA NADIE SE ENTERA peepoPls",
            "Búsquenme en todas mis redes sociales como @Corvinemeys para más contenido fuera de stream peepoPls",
            "Respeta las !reglas del stream, los moderadores revisan constantemente el chat CLEAN",
            "¿Tienes prime? ¿Porqué no aprovecharlo con este dino pobre? SUS CRI BE TE CON P R I M E peepoPls",
            "Ves este emote? -> HoldThisL ? Si no es así, descarga la extensión de 7tv aquí: https://7tv.app/"
        };

        Random random = new Random();
        int index = random.nextInt(respuestas.length);
        System.out.println(respuestas[index]);
    }
}
