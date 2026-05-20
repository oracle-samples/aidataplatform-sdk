# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class LogGroup(object):
    """
    Log group details.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new LogGroup object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param compartment_id:
            The value to assign to the compartment_id property of this LogGroup.
        :type compartment_id: str

        :param group_name:
            The value to assign to the group_name property of this LogGroup.
        :type group_name: str

        :param log_name:
            The value to assign to the log_name property of this LogGroup.
        :type log_name: str

        """
        self.swagger_types = {
            'compartment_id': 'str',
            'group_name': 'str',
            'log_name': 'str'
        }

        self.attribute_map = {
            'compartment_id': 'compartmentId',
            'group_name': 'groupName',
            'log_name': 'logName'
        }

        self._compartment_id = None
        self._group_name = None
        self._log_name = None

    @property
    def compartment_id(self):
        """
        Gets the compartment_id of this LogGroup.
        The compartment ID of the log group.


        :return: The compartment_id of this LogGroup.
        :rtype: str
        """
        return self._compartment_id

    @compartment_id.setter
    def compartment_id(self, compartment_id):
        """
        Sets the compartment_id of this LogGroup.
        The compartment ID of the log group.


        :param compartment_id: The compartment_id of this LogGroup.
        :type: str
        """
        self._compartment_id = compartment_id

    @property
    def group_name(self):
        """
        Gets the group_name of this LogGroup.
        Log group name.


        :return: The group_name of this LogGroup.
        :rtype: str
        """
        return self._group_name

    @group_name.setter
    def group_name(self, group_name):
        """
        Sets the group_name of this LogGroup.
        Log group name.


        :param group_name: The group_name of this LogGroup.
        :type: str
        """
        self._group_name = group_name

    @property
    def log_name(self):
        """
        Gets the log_name of this LogGroup.
        Log name.


        :return: The log_name of this LogGroup.
        :rtype: str
        """
        return self._log_name

    @log_name.setter
    def log_name(self, log_name):
        """
        Sets the log_name of this LogGroup.
        Log name.


        :param log_name: The log_name of this LogGroup.
        :type: str
        """
        self._log_name = log_name

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
