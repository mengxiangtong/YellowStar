package manage;

import entity.Device;
import exception.DeviceException;
import java.util.List;

/**
 * 设备管理层
 */
public interface DeviceManage {

    /**
     * 添加设备信息
     * @param device
     * @return
     * @throws DeviceException
     */
    public boolean saveDevice(Device device) throws DeviceException;

    /**
     * 删除某设备信息
     * @param did
     * @return
     * @throws DeviceException
     */
    public boolean deleteDevice(int did) throws DeviceException;

    /**
     * 修改某设备信息
     * @param device
     * @return
     * @throws DeviceException
     */
    public boolean updateDevice(Device device) throws DeviceException;

    /**
     * 列出设备信息
     * @return
     * @throws DeviceException
     */
    public List<Device> listDevice () throws DeviceException;
}