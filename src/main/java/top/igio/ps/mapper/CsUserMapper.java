package top.igio.ps.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import top.igio.ps.entity.CsUser;


/**
* @author igio
* @description 针对表【cs_user(用户信息表)】的数据库操作Mapper
* @createDate 2023-07-23 15:05:43
* @Entity top.igio.csbase.entity.CsUser
*/
@Mapper
public interface CsUserMapper extends BaseMapper<CsUser> {

}




