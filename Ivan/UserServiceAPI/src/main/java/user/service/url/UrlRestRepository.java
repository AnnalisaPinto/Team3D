package user.service.url;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import user.service.user.User;


@RepositoryRestResource(collectionResourceRel="url", path="url")
public interface UrlRestRepository extends CrudRepository<Url, Integer>{
	
	
	List<Url> findByType(String type);
	List<Url> findByUserId(int id);
	@Query(value="SELECT * FROM `url` WHERE url.user_id = (?1) AND url.type= (?2);", nativeQuery=true)
	List<Url> findByUserIdType(User id, String type);
	Url findById(int id);
	Url findByUrl(String url);
	void deleteByUrl(String url);
	

	
	
	
}






































/*

"_.-**-._\r\n"
+ "                    _,(        ),_\r\n"
+ "                 .-\"   '-^----'   \"-.\r\n"
+ "              .-'                    '-.\r\n"
+ "            .'                          '.\r\n"
+ "          .'    __.--**'\"\"\"\"\"\"'**--.__    '.\r\n"
+ "         /_.-*\"'__.--**'\"\"\"\"\"\"'**--.__'\"*-._\\\r\n"
+ "        /_..-*\"'   .-*\"*-.  .-*\"*-.   '\"*-.._\\\r\n"
+ "       :          /       ;:       \\          ;\r\n"
+ "       :         :     *  !!  *     :         ;\r\n"
+ "        \\        '.     .'  '.     .'        /\r\n"
+ "         \\         '-.-'      '-.-'         /\r\n"
+ "      .-*''.                              .'-.\r\n"
+ "   .-'      '.                          .'    '.\r\n"
+ "  :           '-.        _.._        .-'        '._\r\n"
+ " ;\"*-._          '-._  --___ `   _.-'        _.*'  '*.\r\n"
+ ":      '.            `\"*-.__.-*\"`           (        :\r\n"
+ " ;      ;                 *|                 '-.     ;\r\n"
+ "  '---*'                   |                    \"\"--'\r\n"
+ "   :                      *|                      :\r\n"
+ "   '.                      |                     .'\r\n"
+ "     '.._                 *|        _\r\n"
+ ""		'.._                 *|        ____----.._-'
  			 """----_____------'-----"""         /
  				__..-------.._        ___..---._  /
:			'"              '-..--''          "';
 			'""""""""""""""""' '"""""""""""""""'
*/