# coding: utf-8
# Copyright (c) 2026, Oracle and/or its affiliates.  All rights reserved.



from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class LoggedModel(object):
    """
    Details of the LoggedModel.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new LoggedModel object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param info:
            The value to assign to the info property of this LoggedModel.
        :type info: oci.aidataplatform_dp.models.LoggedModelInfo

        :param data:
            The value to assign to the data property of this LoggedModel.
        :type data: object

        """
        self.swagger_types = {
            'info': 'LoggedModelInfo',
            'data': 'object'
        }

        self.attribute_map = {
            'info': 'info',
            'data': 'data'
        }

        self._info = None
        self._data = None

    @property
    def info(self):
        """
        Gets the info of this LoggedModel.

        :return: The info of this LoggedModel.
        :rtype: oci.aidataplatform_dp.models.LoggedModelInfo
        """
        return self._info

    @info.setter
    def info(self, info):
        """
        Sets the info of this LoggedModel.

        :param info: The info of this LoggedModel.
        :type: oci.aidataplatform_dp.models.LoggedModelInfo
        """
        self._info = info

    @property
    def data(self):
        """
        Gets the data of this LoggedModel.
        Details of the LoggedModel data.


        :return: The data of this LoggedModel.
        :rtype: object
        """
        return self._data

    @data.setter
    def data(self, data):
        """
        Sets the data of this LoggedModel.
        Details of the LoggedModel data.


        :param data: The data of this LoggedModel.
        :type: object
        """
        self._data = data

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
