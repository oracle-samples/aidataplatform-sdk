# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.

from .create_cluster_details import CreateClusterDetails
from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class CreateSparkClusterDetails(CreateClusterDetails):
    """
    Spark cluster details for creation.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new CreateSparkClusterDetails object with values from keyword arguments. The default value of the :py:attr:`~oci.aidataplatform_dp.models.CreateSparkClusterDetails.type` attribute
        of this class is ``USER`` and it should not be changed.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param type:
            The value to assign to the type property of this CreateSparkClusterDetails.
            Allowed values for this property are: "USER", "AGENT_FLOW_COMPUTE"
        :type type: str

        :param display_name:
            The value to assign to the display_name property of this CreateSparkClusterDetails.
        :type display_name: str

        :param description:
            The value to assign to the description property of this CreateSparkClusterDetails.
        :type description: str

        :param driver_config:
            The value to assign to the driver_config property of this CreateSparkClusterDetails.
        :type driver_config: oci.aidataplatform_dp.models.DriverConfig

        :param node_type:
            The value to assign to the node_type property of this CreateSparkClusterDetails.
        :type node_type: str

        :param worker_config:
            The value to assign to the worker_config property of this CreateSparkClusterDetails.
        :type worker_config: oci.aidataplatform_dp.models.WorkerConfig

        :param cluster_runtime_config:
            The value to assign to the cluster_runtime_config property of this CreateSparkClusterDetails.
        :type cluster_runtime_config: oci.aidataplatform_dp.models.ClusterRuntimeConfig

        :param logging_config:
            The value to assign to the logging_config property of this CreateSparkClusterDetails.
        :type logging_config: oci.aidataplatform_dp.models.LoggingConfig

        :param auto_termination_minutes:
            The value to assign to the auto_termination_minutes property of this CreateSparkClusterDetails.
        :type auto_termination_minutes: int

        :param attach_to_notebook_config:
            The value to assign to the attach_to_notebook_config property of this CreateSparkClusterDetails.
        :type attach_to_notebook_config: oci.aidataplatform_dp.models.AttachToNotebookConfig

        :param subscription:
            The value to assign to the subscription property of this CreateSparkClusterDetails.
        :type subscription: oci.aidataplatform_dp.models.SubscriptionDetails

        """
        self.swagger_types = {
            'type': 'str',
            'display_name': 'str',
            'description': 'str',
            'driver_config': 'DriverConfig',
            'node_type': 'str',
            'worker_config': 'WorkerConfig',
            'cluster_runtime_config': 'ClusterRuntimeConfig',
            'logging_config': 'LoggingConfig',
            'auto_termination_minutes': 'int',
            'attach_to_notebook_config': 'AttachToNotebookConfig',
            'subscription': 'SubscriptionDetails'
        }

        self.attribute_map = {
            'type': 'type',
            'display_name': 'displayName',
            'description': 'description',
            'driver_config': 'driverConfig',
            'node_type': 'nodeType',
            'worker_config': 'workerConfig',
            'cluster_runtime_config': 'clusterRuntimeConfig',
            'logging_config': 'loggingConfig',
            'auto_termination_minutes': 'autoTerminationMinutes',
            'attach_to_notebook_config': 'attachToNotebookConfig',
            'subscription': 'subscription'
        }

        self._type = None
        self._display_name = None
        self._description = None
        self._driver_config = None
        self._node_type = None
        self._worker_config = None
        self._cluster_runtime_config = None
        self._logging_config = None
        self._auto_termination_minutes = None
        self._attach_to_notebook_config = None
        self._subscription = None
        self._type = 'USER'

    @property
    def worker_config(self):
        """
        Gets the worker_config of this CreateSparkClusterDetails.

        :return: The worker_config of this CreateSparkClusterDetails.
        :rtype: oci.aidataplatform_dp.models.WorkerConfig
        """
        return self._worker_config

    @worker_config.setter
    def worker_config(self, worker_config):
        """
        Sets the worker_config of this CreateSparkClusterDetails.

        :param worker_config: The worker_config of this CreateSparkClusterDetails.
        :type: oci.aidataplatform_dp.models.WorkerConfig
        """
        self._worker_config = worker_config

    @property
    def cluster_runtime_config(self):
        """
        Gets the cluster_runtime_config of this CreateSparkClusterDetails.

        :return: The cluster_runtime_config of this CreateSparkClusterDetails.
        :rtype: oci.aidataplatform_dp.models.ClusterRuntimeConfig
        """
        return self._cluster_runtime_config

    @cluster_runtime_config.setter
    def cluster_runtime_config(self, cluster_runtime_config):
        """
        Sets the cluster_runtime_config of this CreateSparkClusterDetails.

        :param cluster_runtime_config: The cluster_runtime_config of this CreateSparkClusterDetails.
        :type: oci.aidataplatform_dp.models.ClusterRuntimeConfig
        """
        self._cluster_runtime_config = cluster_runtime_config

    @property
    def logging_config(self):
        """
        Gets the logging_config of this CreateSparkClusterDetails.

        :return: The logging_config of this CreateSparkClusterDetails.
        :rtype: oci.aidataplatform_dp.models.LoggingConfig
        """
        return self._logging_config

    @logging_config.setter
    def logging_config(self, logging_config):
        """
        Sets the logging_config of this CreateSparkClusterDetails.

        :param logging_config: The logging_config of this CreateSparkClusterDetails.
        :type: oci.aidataplatform_dp.models.LoggingConfig
        """
        self._logging_config = logging_config

    @property
    def auto_termination_minutes(self):
        """
        Gets the auto_termination_minutes of this CreateSparkClusterDetails.
        Optional timeout value in minutes used to automatically stop idle compute clusters.


        :return: The auto_termination_minutes of this CreateSparkClusterDetails.
        :rtype: int
        """
        return self._auto_termination_minutes

    @auto_termination_minutes.setter
    def auto_termination_minutes(self, auto_termination_minutes):
        """
        Sets the auto_termination_minutes of this CreateSparkClusterDetails.
        Optional timeout value in minutes used to automatically stop idle compute clusters.


        :param auto_termination_minutes: The auto_termination_minutes of this CreateSparkClusterDetails.
        :type: int
        """
        self._auto_termination_minutes = auto_termination_minutes

    @property
    def attach_to_notebook_config(self):
        """
        Gets the attach_to_notebook_config of this CreateSparkClusterDetails.

        :return: The attach_to_notebook_config of this CreateSparkClusterDetails.
        :rtype: oci.aidataplatform_dp.models.AttachToNotebookConfig
        """
        return self._attach_to_notebook_config

    @attach_to_notebook_config.setter
    def attach_to_notebook_config(self, attach_to_notebook_config):
        """
        Sets the attach_to_notebook_config of this CreateSparkClusterDetails.

        :param attach_to_notebook_config: The attach_to_notebook_config of this CreateSparkClusterDetails.
        :type: oci.aidataplatform_dp.models.AttachToNotebookConfig
        """
        self._attach_to_notebook_config = attach_to_notebook_config

    @property
    def subscription(self):
        """
        Gets the subscription of this CreateSparkClusterDetails.

        :return: The subscription of this CreateSparkClusterDetails.
        :rtype: oci.aidataplatform_dp.models.SubscriptionDetails
        """
        return self._subscription

    @subscription.setter
    def subscription(self, subscription):
        """
        Sets the subscription of this CreateSparkClusterDetails.

        :param subscription: The subscription of this CreateSparkClusterDetails.
        :type: oci.aidataplatform_dp.models.SubscriptionDetails
        """
        self._subscription = subscription

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
