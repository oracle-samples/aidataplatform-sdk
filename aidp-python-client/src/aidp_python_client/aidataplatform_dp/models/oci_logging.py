# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.

from .logging_config import LoggingConfig
from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class OciLogging(LoggingConfig):
    """
    OCI logging configuration.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new OciLogging object with values from keyword arguments. The default value of the :py:attr:`~oci.aidataplatform_dp.models.OciLogging.type` attribute
        of this class is ``OCI_LOGGING`` and it should not be changed.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param type:
            The value to assign to the type property of this OciLogging.
            Allowed values for this property are: "OCI_LOGGING"
        :type type: str

        :param log_groups:
            The value to assign to the log_groups property of this OciLogging.
        :type log_groups: list[oci.aidataplatform_dp.models.LogGroup]

        """
        self.swagger_types = {
            'type': 'str',
            'log_groups': 'list[LogGroup]'
        }

        self.attribute_map = {
            'type': 'type',
            'log_groups': 'logGroups'
        }

        self._type = None
        self._log_groups = None
        self._type = 'OCI_LOGGING'

    @property
    def log_groups(self):
        """
        Gets the log_groups of this OciLogging.
        Init script paths that are run in the order of definition.


        :return: The log_groups of this OciLogging.
        :rtype: list[oci.aidataplatform_dp.models.LogGroup]
        """
        return self._log_groups

    @log_groups.setter
    def log_groups(self, log_groups):
        """
        Sets the log_groups of this OciLogging.
        Init script paths that are run in the order of definition.


        :param log_groups: The log_groups of this OciLogging.
        :type: list[oci.aidataplatform_dp.models.LogGroup]
        """
        self._log_groups = log_groups

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
