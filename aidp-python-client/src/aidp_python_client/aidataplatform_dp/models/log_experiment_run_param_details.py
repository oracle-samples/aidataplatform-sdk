# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class LogExperimentRunParamDetails(object):
    """
    Details of an Experiment Run Param
    """

    def __init__(self, **kwargs):
        """
        Initializes a new LogExperimentRunParamDetails object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param run_id:
            The value to assign to the run_id property of this LogExperimentRunParamDetails.
        :type run_id: str

        :param key:
            The value to assign to the key property of this LogExperimentRunParamDetails.
        :type key: str

        :param value:
            The value to assign to the value property of this LogExperimentRunParamDetails.
        :type value: str

        """
        self.swagger_types = {
            'run_id': 'str',
            'key': 'str',
            'value': 'str'
        }

        self.attribute_map = {
            'run_id': 'run_id',
            'key': 'key',
            'value': 'value'
        }

        self._run_id = None
        self._key = None
        self._value = None

    @property
    def run_id(self):
        """
        **[Required]** Gets the run_id of this LogExperimentRunParamDetails.
        Unique identifier for the run.


        :return: The run_id of this LogExperimentRunParamDetails.
        :rtype: str
        """
        return self._run_id

    @run_id.setter
    def run_id(self, run_id):
        """
        Sets the run_id of this LogExperimentRunParamDetails.
        Unique identifier for the run.


        :param run_id: The run_id of this LogExperimentRunParamDetails.
        :type: str
        """
        self._run_id = run_id

    @property
    def key(self):
        """
        **[Required]** Gets the key of this LogExperimentRunParamDetails.
        Name of the param


        :return: The key of this LogExperimentRunParamDetails.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key):
        """
        Sets the key of this LogExperimentRunParamDetails.
        Name of the param


        :param key: The key of this LogExperimentRunParamDetails.
        :type: str
        """
        self._key = key

    @property
    def value(self):
        """
        **[Required]** Gets the value of this LogExperimentRunParamDetails.
        Value of the param


        :return: The value of this LogExperimentRunParamDetails.
        :rtype: str
        """
        return self._value

    @value.setter
    def value(self, value):
        """
        Sets the value of this LogExperimentRunParamDetails.
        Value of the param


        :param value: The value of this LogExperimentRunParamDetails.
        :type: str
        """
        self._value = value

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
