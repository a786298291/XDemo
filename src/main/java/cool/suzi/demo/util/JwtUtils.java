package cool.suzi.demo.util;

import cool.suzi.demo.domain.User;
import io.jsonwebtoken.*;

import java.util.Date;

public class JwtUtils {
    /**
     * 过期时间
     */
    private static final long EXPIRE = 60000*60*12*7;
    /**
     * 加密密钥
     */
    private static final String SECRET = "XDclass";
    /**
     * 令牌前缀
     */
    private static final String TOKEN_PREFIX = "XDclass";
    /**
     * subject
     */
    private static final String SUBJECT = "XDclass";
    /**
     * 根据用户信息，生成令牌
     */
    public static String geneJsonWebToken(User user){
        String token = Jwts.builder().setSubject(SUBJECT).
                claim("Head_img", user.getHead_img()).
                claim("id", user.getId()).
                claim("name", user.getName()).
                setIssuedAt(new Date()).
                setExpiration(new Date(System.currentTimeMillis() + EXPIRE)).
                signWith(SignatureAlgorithm.HS256, SECRET).compact();
        token = TOKEN_PREFIX + token;
        return token;
    }
    /**
     * 校验token的方法
     */
    public static Claims checkJWT(String token){
        try {
            final Claims claims = Jwts.parser().setSigningKey(SECRET).
                    parseClaimsJws(token.replace(TOKEN_PREFIX,"")).getBody();
            return claims;
        } catch (Exception e) {
            return null;
        }

    }
}
