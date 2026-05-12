# coding: utf-8
# Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
# This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.


from oci.util import formatted_flat_dict, NONE_SENTINEL, value_allowed_none_or_none_sentinel  # noqa: F401
from oci.decorators import init_model_state_from_kwargs


@init_model_state_from_kwargs
class AirflowCellConfig(object):
    """
    The airflow cell ID and the URL.
    """

    def __init__(self, **kwargs):
        """
        Initializes a new AirflowCellConfig object with values from keyword arguments.
        The following keyword arguments are supported (corresponding to the getters/setters of this class):

        :param cell_id:
            The value to assign to the cell_id property of this AirflowCellConfig.
        :type cell_id: str

        :param cell_url:
            The value to assign to the cell_url property of this AirflowCellConfig.
        :type cell_url: str

        """
        self.swagger_types = {
            'cell_id': 'str',
            'cell_url': 'str'
        }

        self.attribute_map = {
            'cell_id': 'cellId',
            'cell_url': 'cellUrl'
        }

        self._cell_id = None
        self._cell_url = None

    @property
    def cell_id(self):
        """
        Gets the cell_id of this AirflowCellConfig.
        The airflow cell ID.


        :return: The cell_id of this AirflowCellConfig.
        :rtype: str
        """
        return self._cell_id

    @cell_id.setter
    def cell_id(self, cell_id):
        """
        Sets the cell_id of this AirflowCellConfig.
        The airflow cell ID.


        :param cell_id: The cell_id of this AirflowCellConfig.
        :type: str
        """
        self._cell_id = cell_id

    @property
    def cell_url(self):
        """
        Gets the cell_url of this AirflowCellConfig.
        The airflow cell URL.


        :return: The cell_url of this AirflowCellConfig.
        :rtype: str
        """
        return self._cell_url

    @cell_url.setter
    def cell_url(self, cell_url):
        """
        Sets the cell_url of this AirflowCellConfig.
        The airflow cell URL.


        :param cell_url: The cell_url of this AirflowCellConfig.
        :type: str
        """
        self._cell_url = cell_url

    def __repr__(self):
        return formatted_flat_dict(self)

    def __eq__(self, other):
        if other is None:
            return False

        return self.__dict__ == other.__dict__

    def __ne__(self, other):
        return not self == other
