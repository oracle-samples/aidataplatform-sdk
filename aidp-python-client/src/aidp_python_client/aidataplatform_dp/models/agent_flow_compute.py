# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.


from .cluster import Cluster
from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class AgentFlowCompute(Cluster):
    """
    User-created cluster.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new AgentFlowCompute object with values from keyword arguments. The default value of the :py:attr:`~oci.aidataplatform_dp.models.AgentFlowCompute.source_api` attribute
        of this class is ``AGENT_FLOW_COMPUTE`` and it should not be changed.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param key:
            The value to assign to the key property of this AgentFlowCompute.
        :type key: str

        :param display_name:
            The value to assign to the display_name property of this AgentFlowCompute.
        :type display_name: str

        :param description:
            The value to assign to the description property of this AgentFlowCompute.
        :type description: str

        :param source_api:
            The value to assign to the source_api property of this AgentFlowCompute.
            Allowed values for this property are: "CLUSTER_API", "DEFAULT_CLUSTER_API", "AGENT_FLOW_COMPUTE"
        :type source_api: str

        :param type:
            The value to assign to the type property of this AgentFlowCompute.
            Allowed values for this property are: "USER", "AGENT_FLOW_COMPUTE"
        :type type: str

        :param time_created:
            The value to assign to the time_created property of this AgentFlowCompute.
        :type time_created: datetime

        :param time_updated:
            The value to assign to the time_updated property of this AgentFlowCompute.
        :type time_updated: datetime

        :param state:
            The value to assign to the state property of this AgentFlowCompute.
            Allowed values for this property are: "ACCEPTED", "CREATING", "ACTIVE", "DELETING", "DELETED", "FAILED", "STOPPING", "STOPPED", "UPDATING", "RESTARTING", "STARTING", "NETWORK_CONFIGURATION_ATTACH_IN_PROGRESS", "NETWORK_CONFIGURATION_ATTACH_SUCCESSFUL", "NETWORK_CONFIGURATION_ATTACH_FAILED", "NETWORK_CONFIGURATION_DETACH_IN_PROGRESS", "NETWORK_CONFIGURATION_DETACH_SUCCESSFUL", "NETWORK_CONFIGURATION_DETACH_FAILED"
        :type state: str

        :param state_details:
            The value to assign to the state_details property of this AgentFlowCompute.
        :type state_details: str

        :param node_type:
            The value to assign to the node_type property of this AgentFlowCompute.
        :type node_type: str

        :param driver_config:
            The value to assign to the driver_config property of this AgentFlowCompute.
        :type driver_config: oci.aidataplatform_dp.models.DriverConfig

        :param active_cluster_resources:
            The value to assign to the active_cluster_resources property of this AgentFlowCompute.
        :type active_cluster_resources: oci.aidataplatform_dp.models.ActiveClusterResources

        :param created_by:
            The value to assign to the created_by property of this AgentFlowCompute.
        :type created_by: str

        :param created_by_name:
            The value to assign to the created_by_name property of this AgentFlowCompute.
        :type created_by_name: str

        :param updated_by:
            The value to assign to the updated_by property of this AgentFlowCompute.
        :type updated_by: str

        :param updated_by_name:
            The value to assign to the updated_by_name property of this AgentFlowCompute.
        :type updated_by_name: str

        :param stopped_by:
            The value to assign to the stopped_by property of this AgentFlowCompute.
        :type stopped_by: str

        :param stopped_by_name:
            The value to assign to the stopped_by_name property of this AgentFlowCompute.
        :type stopped_by_name: str

        """
        self.swagger_types = {
            'key': 'str',
            'display_name': 'str',
            'description': 'str',
            'source_api': 'str',
            'type': 'str',
            'time_created': 'datetime',
            'time_updated': 'datetime',
            'state': 'str',
            'state_details': 'str',
            'node_type': 'str',
            'driver_config': 'DriverConfig',
            'active_cluster_resources': 'ActiveClusterResources',
            'created_by': 'str',
            'created_by_name': 'str',
            'updated_by': 'str',
            'updated_by_name': 'str',
            'stopped_by': 'str',
            'stopped_by_name': 'str'
        }

        self.attribute_map = {
            'key': 'key',
            'display_name': 'displayName',
            'description': 'description',
            'source_api': 'sourceApi',
            'type': 'type',
            'time_created': 'timeCreated',
            'time_updated': 'timeUpdated',
            'state': 'state',
            'state_details': 'stateDetails',
            'node_type': 'nodeType',
            'driver_config': 'driverConfig',
            'active_cluster_resources': 'activeClusterResources',
            'created_by': 'createdBy',
            'created_by_name': 'createdByName',
            'updated_by': 'updatedBy',
            'updated_by_name': 'updatedByName',
            'stopped_by': 'stoppedBy',
            'stopped_by_name': 'stoppedByName'
        }

        self._key = None
        self._display_name = None
        self._description = None
        self._source_api = None
        self._type = None
        self._time_created = None
        self._time_updated = None
        self._state = None
        self._state_details = None
        self._node_type = None
        self._driver_config = None
        self._active_cluster_resources = None
        self._created_by = None
        self._created_by_name = None
        self._updated_by = None
        self._updated_by_name = None
        self._stopped_by = None
        self._stopped_by_name = None
        self._source_api = 'AGENT_FLOW_COMPUTE'

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
