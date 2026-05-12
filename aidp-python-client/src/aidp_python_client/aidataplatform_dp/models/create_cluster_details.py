# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class CreateClusterDetails(object):
    """
    The information about a new compute cluster.
    """

    #: A constant which can be used with the type property of a CreateClusterDetails.
    #: This constant has a value of "USER"
    TYPE_USER = "USER"

    #: A constant which can be used with the type property of a CreateClusterDetails.
    #: This constant has a value of "AGENT_FLOW_COMPUTE"
    TYPE_AGENT_FLOW_COMPUTE = "AGENT_FLOW_COMPUTE"

    def __init__(self, **kwargs):
        """
        Initializes a new CreateClusterDetails object with values from keyword arguments. This class has the following subclasses and if you are using this class as input
        to a service operations then you should favor using a subclass over the base class:

        * :class:`~oci.aidataplatform_dp.models.CreateAgentFlowComputeDetails`
        * :class:`~oci.aidataplatform_dp.models.CreateSparkClusterDetails`

        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param type:
            The value to assign to the type property of this CreateClusterDetails.
            Allowed values for this property are: "USER", "AGENT_FLOW_COMPUTE"
        :type type: str

        :param display_name:
            The value to assign to the display_name property of this CreateClusterDetails.
        :type display_name: str

        :param description:
            The value to assign to the description property of this CreateClusterDetails.
        :type description: str

        :param driver_config:
            The value to assign to the driver_config property of this CreateClusterDetails.
        :type driver_config: oci.aidataplatform_dp.models.DriverConfig

        :param node_type:
            The value to assign to the node_type property of this CreateClusterDetails.
        :type node_type: str

        """
        self.swagger_types = {
            'type': 'str',
            'display_name': 'str',
            'description': 'str',
            'driver_config': 'DriverConfig',
            'node_type': 'str'
        }

        self.attribute_map = {
            'type': 'type',
            'display_name': 'displayName',
            'description': 'description',
            'driver_config': 'driverConfig',
            'node_type': 'nodeType'
        }

        self._type = None
        self._display_name = None
        self._description = None
        self._driver_config = None
        self._node_type = None

    @staticmethod
    def get_subtype(object_dictionary):
        """
        Given the hash representation of a subtype of this class,
        use the info in the hash to return the class of the subtype.
        """
        type = object_dictionary['type']

        if type == 'AGENT_FLOW_COMPUTE':
            return 'CreateAgentFlowComputeDetails'

        if type == 'USER':
            return 'CreateSparkClusterDetails'
        else:
            return 'CreateClusterDetails'

    @property
    def type(self):
        """
        **[Required]** Gets the type of this CreateClusterDetails.
        ClusterType

        Allowed values for this property are: "USER", "AGENT_FLOW_COMPUTE"


        :return: The type of this CreateClusterDetails.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type):
        """
        Sets the type of this CreateClusterDetails.
        ClusterType


        :param type: The type of this CreateClusterDetails.
        :type: str
        """
        allowed_values = ["USER", "AGENT_FLOW_COMPUTE"]
        if not value_allowed_none_or_none_sentinel(type, allowed_values):
            raise ValueError(
                "Invalid value for `type`, must be None or one of {0}"
                .format(allowed_values)
            )
        self._type = type

    @property
    def display_name(self):
        """
        **[Required]** Gets the display_name of this CreateClusterDetails.
        Cluster name.


        :return: The display_name of this CreateClusterDetails.
        :rtype: str
        """
        return self._display_name

    @display_name.setter
    def display_name(self, display_name):
        """
        Sets the display_name of this CreateClusterDetails.
        Cluster name.


        :param display_name: The display_name of this CreateClusterDetails.
        :type: str
        """
        self._display_name = display_name

    @property
    def description(self):
        """
        Gets the description of this CreateClusterDetails.
        Cluster description.


        :return: The description of this CreateClusterDetails.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description):
        """
        Sets the description of this CreateClusterDetails.
        Cluster description.


        :param description: The description of this CreateClusterDetails.
        :type: str
        """
        self._description = description

    @property
    def driver_config(self):
        """
        **[Required]** Gets the driver_config of this CreateClusterDetails.

        :return: The driver_config of this CreateClusterDetails.
        :rtype: oci.aidataplatform_dp.models.DriverConfig
        """
        return self._driver_config

    @driver_config.setter
    def driver_config(self, driver_config):
        """
        Sets the driver_config of this CreateClusterDetails.

        :param driver_config: The driver_config of this CreateClusterDetails.
        :type: oci.aidataplatform_dp.models.DriverConfig
        """
        self._driver_config = driver_config

    @property
    def node_type(self):
        """
        Gets the node_type of this CreateClusterDetails.
        Cluster node type encodes the node shape and associated resources.


        :return: The node_type of this CreateClusterDetails.
        :rtype: str
        """
        return self._node_type

    @node_type.setter
    def node_type(self, node_type):
        """
        Sets the node_type of this CreateClusterDetails.
        Cluster node type encodes the node shape and associated resources.


        :param node_type: The node_type of this CreateClusterDetails.
        :type: str
        """
        self._node_type = node_type

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
