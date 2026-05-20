# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class BundleDeploymentStatus(object):
    """
    Summary of the most recent completed bundle deployment.
    """

    #: A constant which can be used with the status property of a BundleDeploymentStatus.
    #: This constant has a value of "SUCCEEDED"
    STATUS_SUCCEEDED = "SUCCEEDED"

    #: A constant which can be used with the status property of a BundleDeploymentStatus.
    #: This constant has a value of "FAILED"
    STATUS_FAILED = "FAILED"

    #: A constant which can be used with the status property of a BundleDeploymentStatus.
    #: This constant has a value of "IN_PROGRESS"
    STATUS_IN_PROGRESS = "IN_PROGRESS"

    #: A constant which can be used with the status property of a BundleDeploymentStatus.
    #: This constant has a value of "NOT_DEPLOYED"
    STATUS_NOT_DEPLOYED = "NOT_DEPLOYED"

    def __init__(self, **kwargs):
        """
        Initializes a new BundleDeploymentStatus object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param status:
            The value to assign to the status property of this BundleDeploymentStatus.
            Allowed values for this property are: "SUCCEEDED", "FAILED", "IN_PROGRESS", "NOT_DEPLOYED", 'UNKNOWN_ENUM_VALUE'.
            Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.
        :type status: str

        :param time_started:
            The value to assign to the time_started property of this BundleDeploymentStatus.
        :type time_started: datetime

        :param time_completed:
            The value to assign to the time_completed property of this BundleDeploymentStatus.
        :type time_completed: datetime

        :param message:
            The value to assign to the message property of this BundleDeploymentStatus.
        :type message: str

        :param resources:
            The value to assign to the resources property of this BundleDeploymentStatus.
        :type resources: list[oci.aidataplatform_dp.models.BundleDeployedResource]

        """
        self.swagger_types = {
            'status': 'str',
            'time_started': 'datetime',
            'time_completed': 'datetime',
            'message': 'str',
            'resources': 'list[BundleDeployedResource]'
        }

        self.attribute_map = {
            'status': 'status',
            'time_started': 'timeStarted',
            'time_completed': 'timeCompleted',
            'message': 'message',
            'resources': 'resources'
        }

        self._status = None
        self._time_started = None
        self._time_completed = None
        self._message = None
        self._resources = None

    @property
    def status(self):
        """
        **[Required]** Gets the status of this BundleDeploymentStatus.
        Overall status of the last deployment.

        Allowed values for this property are: "SUCCEEDED", "FAILED", "IN_PROGRESS", "NOT_DEPLOYED", 'UNKNOWN_ENUM_VALUE'.
        Any unrecognized values returned by a service will be mapped to 'UNKNOWN_ENUM_VALUE'.


        :return: The status of this BundleDeploymentStatus.
        :rtype: str
        """
        return self._status

    @status.setter
    def status(self, status):
        """
        Sets the status of this BundleDeploymentStatus.
        Overall status of the last deployment.


        :param status: The status of this BundleDeploymentStatus.
        :type: str
        """
        allowed_values = ["SUCCEEDED", "FAILED", "IN_PROGRESS", "NOT_DEPLOYED"]
        if not value_allowed_none_or_none_sentinel(status, allowed_values):
            status = 'UNKNOWN_ENUM_VALUE'
        self._status = status

    @property
    def time_started(self):
        """
        **[Required]** Gets the time_started of this BundleDeploymentStatus.
        The deployment start time


        :return: The time_started of this BundleDeploymentStatus.
        :rtype: datetime
        """
        return self._time_started

    @time_started.setter
    def time_started(self, time_started):
        """
        Sets the time_started of this BundleDeploymentStatus.
        The deployment start time


        :param time_started: The time_started of this BundleDeploymentStatus.
        :type: datetime
        """
        self._time_started = time_started

    @property
    def time_completed(self):
        """
        **[Required]** Gets the time_completed of this BundleDeploymentStatus.
        The deployment end time


        :return: The time_completed of this BundleDeploymentStatus.
        :rtype: datetime
        """
        return self._time_completed

    @time_completed.setter
    def time_completed(self, time_completed):
        """
        Sets the time_completed of this BundleDeploymentStatus.
        The deployment end time


        :param time_completed: The time_completed of this BundleDeploymentStatus.
        :type: datetime
        """
        self._time_completed = time_completed

    @property
    def message(self):
        """
        Gets the message of this BundleDeploymentStatus.
        Optional summary message for the last deployment.


        :return: The message of this BundleDeploymentStatus.
        :rtype: str
        """
        return self._message

    @message.setter
    def message(self, message):
        """
        Sets the message of this BundleDeploymentStatus.
        Optional summary message for the last deployment.


        :param message: The message of this BundleDeploymentStatus.
        :type: str
        """
        self._message = message

    @property
    def resources(self):
        """
        Gets the resources of this BundleDeploymentStatus.
        List of resources from the last deployment.


        :return: The resources of this BundleDeploymentStatus.
        :rtype: list[oci.aidataplatform_dp.models.BundleDeployedResource]
        """
        return self._resources

    @resources.setter
    def resources(self, resources):
        """
        Sets the resources of this BundleDeploymentStatus.
        List of resources from the last deployment.


        :param resources: The resources of this BundleDeploymentStatus.
        :type: list[oci.aidataplatform_dp.models.BundleDeployedResource]
        """
        self._resources = resources

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
