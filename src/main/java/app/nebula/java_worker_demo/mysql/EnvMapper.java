package app.nebula.java_worker_demo.mysql;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EnvMapper {

    @Select("select * from env")
    List<Env> selectAll();

}
